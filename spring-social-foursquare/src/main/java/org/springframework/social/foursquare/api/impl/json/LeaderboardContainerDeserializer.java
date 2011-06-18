package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.foursquare.api.Leaderboard;

public class LeaderboardContainerDeserializer extends AbstractFoursquareDeserializer<LeaderboardContainer, Leaderboard> {

    LeaderboardContainerDeserializer() {
        super("leaderboard", Leaderboard.class);
    }
    
    @Override
    public LeaderboardContainer deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        return new LeaderboardContainer(getNestedObject(jp));
    }
    
    
}
