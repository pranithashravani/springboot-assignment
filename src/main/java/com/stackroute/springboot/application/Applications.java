/*
package com.stackroute.springboot.application;

import com.stackroute.springboot.domain.Track;
import com.stackroute.springboot.service.TrackService;
import lombok.Data;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import sun.tools.java.Environment;
@Component
@Data
@PropertySource("application.properties")
public class Applications {
    private Track feedTrackData = new Track();

        @Value("${value.id1}")
        private int id1;
        @Value("${value.name1}")
        private String name1;
        @Value("${value.comment1}")
        private String comment1;

        @Autowired
        Environment env;
        @Autowired
        private TrackService trackServices;
        @Override
        public void run(String... args) throws Exception {
            feedTrackData.setId(Integer.parseInt(env.getProperty("value.id1")));
            feedTrackData.setName(env.getProperty("value.name1"));
            feedTrackData.setComment(env.getProperty("value.comment1"));
            trackServices.saveTrack(feedTrackData);





        }
}
*/
