package com.ust.service;

import java.util.List;

import com.ust.Exception.RestuarantNotFoundException;
import com.ust.model.Favourite;

public interface FavouriteService {
	 Favourite saveFavourite( Favourite  favourite) ;
    
     List<Favourite> getAllFavourite() throws RestuarantNotFoundException ;
    
     Favourite getFavouriteById(int userId) throws RestuarantNotFoundException ;
  
     Favourite deleteFavourite(int userId) throws RestuarantNotFoundException ;
    
     Favourite updateFavourite(Favourite favourite) throws RestuarantNotFoundException ;
//     public Favourite searchByName(String name);
// 	public List<Favourite> searchByFavourites(String userId);
}
