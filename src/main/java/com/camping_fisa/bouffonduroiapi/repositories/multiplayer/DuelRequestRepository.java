package com.camping_fisa.bouffonduroiapi.repositories.multiplayer;

import com.camping_fisa.bouffonduroiapi.entities.authentification.User;
import com.camping_fisa.bouffonduroiapi.entities.multiplayer.DuelRequest;
import com.camping_fisa.bouffonduroiapi.entities.multiplayer.DuelRequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DuelRequestRepository extends JpaRepository<DuelRequest, Long> {

    boolean existsBySenderAndReceiverAndStatus(User sender, User receiver, DuelRequestStatus pending);
    List<DuelRequest> findAllBySender(User sender);
    List<DuelRequest> findAllByReceiver(User receiver);
    Optional<DuelRequest> findByIdAndReceiver(Long requestId, User receiver);
}