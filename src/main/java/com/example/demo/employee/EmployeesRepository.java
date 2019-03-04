package com.example.demo.employee;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.stereotype.Repository;

        import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Integer> {
    List<EmployeesEntity> findByIdEmployee (int id);
    @Query(value = "Select * from public.employees",
            nativeQuery = true

    )
    List<EmployeesEntity> test();
}