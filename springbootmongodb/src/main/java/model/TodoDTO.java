package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

//annotations: coming from lamboc package
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//when working with mongodb db - working with documents inside we have collection
@Document(collection = "todoList")

public class TodoDTO {

    @Id
    private String id;
    private String todo;
    private String description;
    private Boolean completed;
    private Date createdAt;
    private Date updatedAt;


}
