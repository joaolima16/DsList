package com.dslist.DsList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslist.DsList.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long> {

}
