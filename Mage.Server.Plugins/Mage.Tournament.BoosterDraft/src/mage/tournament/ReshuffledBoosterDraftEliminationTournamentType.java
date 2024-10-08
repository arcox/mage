

package mage.tournament;

import mage.game.tournament.TournamentType;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class ReshuffledBoosterDraftEliminationTournamentType extends TournamentType {

    public ReshuffledBoosterDraftEliminationTournamentType() {
        this.name = "Booster Draft Elimination (Reshuffled)";
        this.maxPlayers = 16;
        this.minPlayers = 4;
        this.numBoosters = 3;
        this.draft = true;
        this.limited = true;
        this.cubeBooster = false;
        this.elimination = true;
        this.isReshuffled = true;
    }

}
