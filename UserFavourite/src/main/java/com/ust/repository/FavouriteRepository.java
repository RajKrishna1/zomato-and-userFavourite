package com.ust.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.model.Favourite;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourite, Integer> {
//	public List<Favourite> findByFavourites(String userId);
//	public Favourite findByName(String name);
}
