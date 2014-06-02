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

package mage.sets.magic2011;

import java.util.UUID;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Layer;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.constants.SubLayer;
import mage.constants.Zone;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.abilities.effects.common.continious.CantGainLifeAllEffect;
import mage.abilities.keyword.LeylineAbility;
import mage.cards.CardImpl;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.players.Player;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class LeylineOfPunishment extends CardImpl<LeylineOfPunishment> {

    public LeylineOfPunishment(UUID ownerId) {
        super(ownerId, 148, "Leyline of Punishment", Rarity.RARE, new CardType[]{CardType.ENCHANTMENT}, "{2}{R}{R}");
        this.expansionSetCode = "M11";
        this.color.setRed(true);

        // If Leyline of Punishment is in your opening hand, you may begin the game with it on the battlefield.
        this.addAbility(LeylineAbility.getInstance());
        // Players can't gain life.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new CantGainLifeAllEffect()));
        // Damage can't be prevented.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new LeylineOfPunishmentEffect2()));
    }

    public LeylineOfPunishment(final LeylineOfPunishment card) {
        super(card);
    }

    @Override
    public LeylineOfPunishment copy() {
        return new LeylineOfPunishment(this);
    }

}

class LeylineOfPunishmentEffect2 extends ReplacementEffectImpl {

    public LeylineOfPunishmentEffect2() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "Damage can't be prevented";
    }

    public LeylineOfPunishmentEffect2(final LeylineOfPunishmentEffect2 effect) {
        super(effect);
    }

    @Override
    public LeylineOfPunishmentEffect2 copy() {
        return new LeylineOfPunishmentEffect2(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        return true;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        if (event.getType() == EventType.PREVENT_DAMAGE) {
            return true;
        }
        return false;
    }

}
