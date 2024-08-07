package at.afes.noire.dto;

import java.util.List;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WastlDTO {
    @JsonProperty("CurrentState")
    private String currentState;

    @JsonProperty("EinsatzData")
    private List<EinsatzData> einsatzData;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EinsatzData {
        @JsonProperty("EinsatzID")
        private String einsatzId;

        @JsonProperty("Status")
        private Long status;

        @JsonProperty("Alarmstufe")
        private String alarmstufe;

        @JsonProperty("Meldebild")
        private String meldebild;

        @JsonProperty("Lng")
        private double lng;

        @JsonProperty("Lat")
        private double lat;

        @JsonProperty("Accuracy")
        private String accuracy;

        @JsonProperty("Nummer1")
        private String nummer1;

        @JsonProperty("Nummer2")
        private String nummer2;

        @JsonProperty("Nummer3")
        private String nummer3;

        @JsonProperty("Plz")
        private String plz;

        @JsonProperty("Strasse")
        private String strasse;

        @JsonProperty("Ort")
        private String ort;

        @JsonProperty("Abschnitt")
        private String abschnitt;

        @JsonProperty("Objekt")
        private String objekt;

        @JsonProperty("ObjektId")
        private String objektId;

        @JsonProperty("Bemerkung")
        private String bemerkung;

        @JsonProperty("EinsatzErzeugt")
        private LocalDateTime einsatzErzeugt;

        @JsonProperty("Melder")
        private String melder;

        @JsonProperty("MelderTelefon")
        private String melderTelefon;

        @JsonProperty("Dispositionen")
        private List<Disposition> dispositionen;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Disposition {
            @JsonProperty("Name")
            private String name;

            @JsonProperty("EldisId")
            private Long eldisId;

            @JsonProperty("IsEigenalarmiert")
            private Boolean isEigenalarmiert;

            @JsonProperty("DispoTime")
            private LocalDateTime dispoTime;

            @JsonProperty("AlarmTime")
            private LocalDateTime alarmTime;

            @JsonProperty("EinTime")
            private LocalDateTime einTime;

            @JsonProperty("IsBackground")
            private Boolean isBackground;
        }
    }
}

