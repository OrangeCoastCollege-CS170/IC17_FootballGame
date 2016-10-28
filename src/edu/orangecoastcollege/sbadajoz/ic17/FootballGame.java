package edu.orangecoastcollege.sbadajoz.ic17;
/*
Badajoz, Seve
CS A170
October 28, 2016

IC17
*/
public class FootballGame {
    private String mHomeTeam;
    private String mVisitorTeam;
    private int mHomeScore;
    private int mVisitorScore;
    
    public FootballGame(String homeTeam, String visitorTeam) {
        mHomeTeam = homeTeam;
        mVisitorTeam = visitorTeam;
        mHomeScore = 0;
        mVisitorScore = 0;
    }
    
    public int getHomeScore() {
        return mHomeScore;
    }
    public int getVisitorScore() {
        return mVisitorScore;
    }
    
    public boolean scoreTouchdown(String teamName) {
        return addPoints(6, teamName);
    }
    
    public boolean scoreExtraPoint(String teamName) {
        return addPoints(1, teamName);
    }
    
    public boolean scoreConversion(String teamName) {
        return addPoints(2,teamName);
    }
    
    public boolean scoreFieldGoal(String teamName) {
        return addPoints(3, teamName);
    }
    
    public boolean scoreSafety(String teamName) {
        return addPoints(2, teamName);
    }
    
    public boolean addPoints(int points, String team) {
        if(team.equals(mHomeTeam)) {
            mHomeScore += points;
            return true;
        }
        
        else if(team.equals(mVisitorTeam)) {
            mVisitorScore += points;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mHomeScore;
        result = prime * result + ((mHomeTeam == null) ? 0 : mHomeTeam.hashCode());
        result = prime * result + mVisitorScore;
        result = prime * result + ((mVisitorTeam == null) ? 0 : mVisitorTeam.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        FootballGame other = (FootballGame) obj;
        if (mHomeScore != other.mHomeScore) return false;
        if (mHomeTeam == null)
        {
            if (other.mHomeTeam != null) return false;
        }
        else if (!mHomeTeam.equals(other.mHomeTeam)) return false;
        if (mVisitorScore != other.mVisitorScore) return false;
        if (mVisitorTeam == null)
        {
            if (other.mVisitorTeam != null) return false;
        }
        else if (!mVisitorTeam.equals(other.mVisitorTeam)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "FootballGame [" + mHomeTeam + "=" + mHomeScore + ", " + mVisitorTeam
                + "=" + mVisitorScore + " ~~~ " + ((mHomeScore > mVisitorScore)? "Home Team is Winning":"") 
                + ((mHomeScore < mVisitorScore)? "Visiting Team is Winning":"") 
                + ((mHomeScore == mVisitorScore)? "It's a Tie":"") + "]";
    }
    
    
}
