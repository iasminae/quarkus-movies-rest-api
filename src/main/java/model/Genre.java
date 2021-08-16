package model;

import javax.persistence.Enumerated;

public enum Genre {

    HORROR("Horror", "Films in the horror genre are calculated to cause intense repugnance, fear, " +
            "or dread. Horror films may incorporate incidents of physical violence and psychological terror"),
    ACTION("Action", "Action film is a film genre in which the protagonist or protagonists are " +
            "thrust into a series of events that typically include violence, extended fighting, physical feats, " +
            "rescues and frantic chases"),
    ADVENTURE("Adventure", "Adventure films are a genre of film whose plots feature elements of travel. " +
            "They typically involve protagonists who must leave their home or place of comfort and go to far away " +
            "lands to fulfill a goal."),
    SCIFI("Science-fiction", "Science fiction (or sci-fi) is a film genre that uses speculative " +
            "science-based depictions of phenomena that are not fully accepted by mainstream science, " +
            "such as extraterrestrial lifeforms, alien worlds, extrasensory perception and time travel, " +
            "along with futuristic elements "),
    FANTASY("Fantasy", "Fantasy films are films that belong to the fantasy genre with fantastic themes, " +
            "usually magic, supernatural events, mythology, folklore, or exotic fantasy worlds."),
    ROMANCE("Romance", "Romance films are love stories, or affairs of the heart that center on passion, " +
            "emotion, and the romantic, affectionate involvement of the main characters, and the journey that their " +
            "love takes through courtship or marriage.");


    private final String name;
    private final String description;

    Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
