package com.example.demo.employee;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Modifying;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.stereotype.Repository;

        import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Integer> {
        EmployeesEntity findByIdEmployee(int trainerId);
        EmployeesEntity findByEmail(String emailUser);
}