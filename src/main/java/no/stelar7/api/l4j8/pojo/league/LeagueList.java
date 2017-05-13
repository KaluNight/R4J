package no.stelar7.api.l4j8.pojo.league;

import no.stelar7.api.l4j8.basic.constants.types.*;

import java.util.*;

public class LeagueList
{
    
    private List<LeagueItem> entries;
    private String           name;
    private GameQueueType    queue;
    private TierType         tier;
    
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final LeagueList other = (LeagueList) obj;
        if (this.entries == null)
        {
            if (other.entries != null)
            {
                return false;
            }
        } else if (!this.entries.equals(other.entries))
        {
            return false;
        }
        if (this.name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        } else if (!this.name.equals(other.name))
        {
            return false;
        }
        if (this.queue == null)
        {
            if (other.queue != null)
            {
                return false;
            }
        } else if (!this.queue.equals(other.queue))
        {
            return false;
        }
        if (this.tier == null)
        {
            if (other.tier != null)
            {
                return false;
            }
        } else if (!this.tier.equals(other.tier))
        {
            return false;
        }
        return true;
    }
    
    /**
     * The requested league entries.
     *
     * @return the entries
     */
    public List<LeagueItem> getEntries()
    {
        return this.entries;
    }
    
    /**
     * This name is an internal place-holder name only. Display and localization of names in the game client are handled client-side.
     *
     * @return the name
     */
    public String getLeagueName()
    {
        return this.name;
    }
    
    
    /**
     * The league's queue type. (Legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5)
     *
     * @return the queue
     */
    public GameQueueType getQueueType()
    {
        return this.queue;
    }
    
    /**
     * The league's tier. (Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE)
     *
     * @return the tier
     */
    public TierType getTier()
    {
        return this.tier;
    }
    
    @Override
    public int hashCode()
    {
        final int prime  = 31;
        int       result = 1;
        result = (prime * result) + ((this.entries == null) ? 0 : this.entries.hashCode());
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.queue == null) ? 0 : this.queue.hashCode());
        result = (prime * result) + ((this.tier == null) ? 0 : this.tier.hashCode());
        return result;
    }
    
    @Override
    public String toString()
    {
        return "LeagueList{" +
               "entries=" + entries +
               ", name='" + name + '\'' +
               ", queue='" + queue + '\'' +
               ", tier='" + tier + '\'' +
               '}';
    }
}