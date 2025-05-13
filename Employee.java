@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private LocalDate joinDate;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
    // Getters, setters, constructors
}