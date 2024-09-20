package hieu.nv.jpa.group.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import hieu.nv.jpa.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "h_groups")
public class Group {

	@Id
	@UuidGenerator
	private String id;

	@Column(name = "name")
	private String name;

	@ManyToMany(mappedBy = "h_groups", fetch = FetchType.LAZY)
	@ToString.Exclude
	@JsonBackReference
	private List<User> users;

}
