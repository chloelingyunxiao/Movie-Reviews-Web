package org.example.movieist;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies")
@Data // create all getter, setter and equals hashCode and toString
@AllArgsConstructor
@NoArgsConstructor // Constructor with no params
public class Movie {
  @Id
  private ObjectId id; // unique identifier

  private String imdbId;

  private String title;

  private String releaseDate;

  private String trailerLink;

  private String poster;

  private List<String> genres;

  private List<String> backdrops;

  @DocumentReference // restore only the ids of the review, and other will in a separate collection
  private List<Review> reviewIds;


}
