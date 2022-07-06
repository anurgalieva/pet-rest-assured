package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LibraryDoc {
    private String key;
    @JsonProperty("title")
    private String title;
    @JsonProperty("publish_date")
    private ArrayList<String> publishDate;
    @JsonProperty("publisher")
    private ArrayList<String> publisher;
    @JsonProperty("language")
    private ArrayList<String> language;
    @JsonProperty("author_name")
    private ArrayList<String> authorName;
}
