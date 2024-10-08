package hieu.nv.jpa.movies.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@DynamicUpdate
@DynamicInsert
@Data
@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@UuidGenerator
	private String id;

	@Column(name = "title")
	private String title;

	@Column(name = "genre")
	private String genre;

	@Column(name = "year")
	private String year;

	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

//	@JsonBackReference
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="cinema_id")
//	private Cinema assignedCinema;
}
