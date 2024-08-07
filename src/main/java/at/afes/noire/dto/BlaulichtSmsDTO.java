package at.afes.noire.dto;

import java.util.List;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlaulichtSmsDTO {
    private String customerId;
    private String customerName;
    private String customerLogoUrl;
    private List<String> features;
    private String username;
    private String userId;
    private Settings settings;
    private CustomerLocation customerLocation;
    private List<String> integrations; // TODO: Integrations (idk what this is)
    private List<Alarm> alarms;
    private List<String> infos; // TODO: infos (idk what this is)
    private List<String> futureAlarms;
    private Blackboard blackboard;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Settings {
        private String type;
        private String version;
        private String screenSaverVersion;
        private String recipientsType;
        private String participantSortOrder;
        private String mapType;
        private Long screenSaverTimeout;
        private Long defaultMapZoomFactor;
        private double defaultMapLongitude;
        private double defaultMapLatitude;
        private boolean showFunctions;
        private boolean showMultipleAlarms;
        private String customLayout;
        private boolean scenariosEnabled;
        private Long mergeWindow;
        private boolean printingEnabled;
        private DefaultMapCoordinates defaultMapCoordinates;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class DefaultMapCoordinates {
            private double lat;
            private double lon;
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class CustomerLocation {
        private String administrativeArea;
        private double latitude;
        private double longitude;
        private double southBoundLatitude;
        private double northBoundLatitude;
        private double westBoundLongitude;
        private double eastBoundLongitude;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Alarm {
        private String productType;
        private String customerId;
        private String customerName;
        private String alarmId;
        private String scenarioId;
        private Long indexNumber;
        private List<AlarmGroup> alarmGroups;
        private LocalDateTime alarmData;
        private LocalDateTime endDate;
        private String authorName;
        private String alarmText;
        private String audioUrl;
        private boolean needsAcknowledgement;
        private Long usersAlertedCount;
        private Geolocation geolocation;
        private Coordinates coordinates;
        private List<Recipient> recipients;
        private List<String> pointsOfInterest; // TODO (idk what this is)
        private List<Topic> topics;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        private static class AlarmGroup {
            private String groupId;
            private String groupName;
        }

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        private static class Geolocation {
            private Coordinates coordinates;
            private boolean positionSetByAuthor;
            private String radius;
            private String distance;
            private String duration;
            private String address;

            @Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Coordinates {
                private double lat;
                private double lon;
            }
        }

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        private static class Coordinates {
            private double lat;
            private double lon;
        }

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        private static class Recipient {
            private String id;
            private String name;
            private String msisdn;
            private String comment;
            private String participation;
            private String participationMessage;
            private List<Function> functions;

            @Data
            @AllArgsConstructor
            @NoArgsConstructor
            private static class Function {
                private String functionId;
                private String name;
                private Long order;
                private String shortForm;
                private String backgroundHexColorCode;
                private String foregroundHexColorCode;
            }
        }
    
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        private static class Topic {
            private String topicId;
            private String type;
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Blackboard {
        private String content;
        private LocalDateTime lastUpdateDate;
        private String lastUpdateAuthorId;
    }

}

