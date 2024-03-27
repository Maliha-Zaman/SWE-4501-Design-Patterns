package FactoryPattern;

public class TrackFactory {
    public Track createTrack(String trackType) {
        if ("BlueMoonBaySpeedway".equalsIgnoreCase(trackType)) {
            return new BlueMoonBaySpeedway("Blue Moon Bay Speedway", "USA");
        } else if ("BBRaceway".equalsIgnoreCase(trackType)) {
            return new BBRaceway("BB Raceway", "Japan");
        } else if ("CircuitSpaFrancorchamps".equalsIgnoreCase(trackType)) {
            return new CircuitSpaFrancorchamps("Circuit de Spa-Francorchamps", "Germany");
        } else {
            // Handle unknown track type, throw exception or return a default track
            throw new IllegalArgumentException("Invalid track type: " + trackType);
        }
    }
}
