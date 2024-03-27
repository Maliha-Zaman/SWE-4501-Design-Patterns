package FactoryPattern;

public abstract class Track {
        private String name;
        private String location;

        public Track(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public void setTrackName(String name) {
            this.name = name;
        }

        public void setTrackLocation(String location) {
            this.location = location;
        }

        public void startLine() {
            System.out.println("Starting Line of the track...");
        }

        public void finishLine() {
            System.out.println("Finish Line of the track...");
        }

        public void trackInfo() {
            System.out.println("Track Information:");
            System.out.println("Track Name: " + name);
            System.out.println("Location: " + location);
        }

        public String getTrackName() {
            return this.name;
        }
    }

