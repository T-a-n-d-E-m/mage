/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.w;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.FilterPermanent;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author L_J
 */
public final class WildMammoth extends CardImpl {

    public WildMammoth(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{G}");
        this.subtype.add(SubType.ELEPHANT);
        this.power = new MageInt(3);
        this.toughness = new MageInt(4);

        // At the beginning of your upkeep, if a player controls more creatures than each other player, the player who controls the most creatures gains control of Wild Mammoth.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(new WildMammothEffect(), TargetController.YOU, false));
    }

    public WildMammoth(final WildMammoth card) {
        super(card);
    }

    @Override
    public WildMammoth copy() {
        return new WildMammoth(this);
    }
}

class WildMammothEffect extends OneShotEffect {

    public WildMammothEffect() {
        super(Outcome.GainControl);
        this.staticText = "if a player controls more creatures than each other player, the player who controls the most creatures gains control of {this}";
    }

    public WildMammothEffect(final WildMammothEffect effect) {
        super(effect);
    }

    @Override
    public WildMammothEffect copy() {
        return new WildMammothEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Permanent sourcePermanent = game.getPermanent(source.getSourceId());
            if (sourcePermanent != null) {
                Player newController = null;
                int maxCreatures = 0;
                boolean tie = false;
                FilterPermanent filter = new FilterPermanent();
                filter.add(new CardTypePredicate(CardType.CREATURE));
                
                for (UUID playerId : game.getState().getPlayersInRange(source.getControllerId(), game)) {
                    Player player = game.getPlayer(playerId);
                    if (player != null) {
                        int value = game.getBattlefield().countAll(filter, playerId, game);
                        if (value > maxCreatures) {
                            maxCreatures = value;
                        }
                    }
                }
                for (UUID playerId : game.getState().getPlayersInRange(source.getControllerId(), game)) {
                    Player player = game.getPlayer(playerId);
                    if (player != null) {
                        int value = game.getBattlefield().countAll(filter, playerId, game);
                        if (value == maxCreatures) {
                            if (newController == null) {
                                newController = player;
                            } else {
                                tie = true;
                                break;
                            }
                        }
                    }
                }
                
                if (!controller.equals(newController) && !tie && newController != null) {
                    ContinuousEffect effect = new GainControlTargetEffect(Duration.Custom, newController.getId());
                    effect.setTargetPointer(new FixedTarget(sourcePermanent, game));
                    game.addEffect(effect, source);
                }
            }
            return true;
        }
        return false;

    }
}
