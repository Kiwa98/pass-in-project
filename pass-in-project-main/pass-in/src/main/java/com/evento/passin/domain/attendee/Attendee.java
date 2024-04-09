package com.evento.passin.domain.attendee;

import com.evento.passin.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
    private String Id;
@Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
@ManyToOne
@JoinColumn(name = "event_id", nullable = false)
    private Event event;
@Column(name = "created_at")
private LocalDateTime createdAt;

}
