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
package mage.cards.v;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.condition.InvertCondition;
import mage.abilities.condition.common.CitysBlessingCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.SacrificeOpponentsEffect;
import mage.abilities.effects.keyword.AscendEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.TargetPermanent;

/**
 *
 * @author LevelX2
 */
public final class VonasHunger extends CardImpl {

    public VonasHunger(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{B}");

        // Ascend (If you control ten or more permanents, you get the city's blessing for the rest of the game.)
        this.getSpellAbility().addEffect(new AscendEffect());

        // Each opponent sacrifices a creature.
        this.getSpellAbility().addEffect(new ConditionalOneShotEffect(
                new SacrificeOpponentsEffect(StaticFilters.FILTER_PERMANENT_A_CREATURE),
                new InvertCondition(CitysBlessingCondition.instance),
                "Each opponent sacrifices a creature"));
        // If you have the city's blessing, instead each opponent sacrifices half the creatures he or she controls rounded up.
        this.getSpellAbility().addEffect(new ConditionalOneShotEffect(
                new VonasHungerEffect(),
                CitysBlessingCondition.instance,
                "If you have the city's blessing, instead each opponent sacrifices half the creatures he or she controls rounded up"));
    }

    public VonasHunger(final VonasHunger card) {
        super(card);
    }

    @Override
    public VonasHunger copy() {
        return new VonasHunger(this);
    }
}

class VonasHungerEffect extends OneShotEffect {

    public VonasHungerEffect() {
        super(Outcome.Sacrifice);
    }

    public VonasHungerEffect(final VonasHungerEffect effect) {
        super(effect);
    }

    @Override
    public VonasHungerEffect copy() {
        return new VonasHungerEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        List<UUID> perms = new ArrayList<>();
        for (UUID playerId : game.getOpponents(source.getControllerId())) {
            Player player = game.getPlayer(playerId);
            if (player != null) {
                int numTargets = (game.getBattlefield().countAll(StaticFilters.FILTER_CONTROLLED_CREATURE, player.getId(), game) + 1) / 2;
                if (numTargets > 0) {
                    TargetPermanent target = new TargetPermanent(numTargets, numTargets, StaticFilters.FILTER_CONTROLLED_CREATURE, true);
                    if (target.canChoose(player.getId(), game)) {
                        player.chooseTarget(Outcome.Sacrifice, target, source, game);
                        perms.addAll(target.getTargets());
                    }
                }
            }
        }
        for (UUID permID : perms) {
            Permanent permanent = game.getPermanent(permID);
            if (permanent != null) {
                permanent.sacrifice(source.getSourceId(), game);
            }
        }
        return true;
    }
}
