package in.Fastbite.helpdesk.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class HelpRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters")
    private String name;

    @NotBlank(message = "Phone is required")
    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
    private String phone;

    @NotBlank(message = "Category is required")
    private String category;

    @NotBlank(message = "Description is required")
    @Size(min = 10, message = "Description must be at least 10 characters")
    private String description;

    // PENDING / IN_PROGRESS / COMPLETED
    private String status;

    private LocalDateTime createdTime;

    // ✅ Who created the request (normal user)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // ✅ Volunteer who accepted this request (can be null)
    @ManyToOne
    @JoinColumn(name = "volunteer_id")
    private User assignedVolunteer;

    public HelpRequest() {
    }

    @PrePersist
    public void prePersist() {
        if (this.status == null) {
            this.status = "PENDING";
        }
        if (this.createdTime == null) {
            this.createdTime = LocalDateTime.now();
        }
    }

    // Getters & Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCreatedTime() { return createdTime; }
    public void setCreatedTime(LocalDateTime createdTime) { this.createdTime = createdTime; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public User getAssignedVolunteer() { return assignedVolunteer; }
    public void setAssignedVolunteer(User assignedVolunteer) { this.assignedVolunteer = assignedVolunteer; }
}
