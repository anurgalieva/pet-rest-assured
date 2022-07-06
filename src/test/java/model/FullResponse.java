package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FullResponse {
    @JsonProperty("numFound")
    private int numFound;
    @JsonProperty("start")
    private int start;
    @JsonProperty("numFoundExact")
    private boolean numFoundExact;
    @JsonProperty("docs")
    private ArrayList<LibraryDoc> docs;
}
