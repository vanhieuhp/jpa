package hieu.nv.jpa.transport.repository;

import hieu.nv.jpa.transport.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, String> {
}