package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Exception.RestuarantNotFoundException;
import com.ust.model.Favourite;
import com.ust.repository.FavouriteRepository;
@Service
public class FavouriteServiceImpl implements FavouriteService {
	@Autowired
	private FavouriteRepository favouriteRepository;

	@Override
	public Favourite saveFavourite(Favourite favourite) {
		
//			Favourite check = favouriteRepository.findById(favourite.getFavouriteId()).orElse(null);
//			
//			if(check == null)
				return favouriteRepository.save(favourite);
//			else
//				throw new FavouriteAlreadyExistsException(); 
		}

	

	@Override
	public List<Favourite> getAllFavourite() throws RestuarantNotFoundException {
		List<Favourite> favourite= (List<Favourite>) favouriteRepository.findAll();

		
		return (List<Favourite>) favouriteRepository.findAll();

	}

	@Override
	public Favourite getFavouriteById(int id) throws RestuarantNotFoundException {
		Optional<Favourite> optional = favouriteRepository.findById(id);
		favouriteRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		else
			throw new RestuarantNotFoundException();
	}


	@Override
	public Favourite deleteFavourite(int id) throws RestuarantNotFoundException{
	
		Optional<Favourite> optional = favouriteRepository.findById(id);
		if (optional.isPresent()) {
			Favourite favouriteById = favouriteRepository.findById(id).get();
			favouriteRepository.deleteById(id);
			return favouriteById ;
		}
	
		else {
			throw new RestuarantNotFoundException();
		}
		
		}



	@Override
	public Favourite updateFavourite(Favourite favourite) throws RestuarantNotFoundException {
		if(favouriteRepository.existsById(favourite.getId())) {

			Favourite save =favouriteRepository.save(favourite);
			return save;
			
		}else
			throw new RestuarantNotFoundException();

	}


//
//	@Override
//	public List<Favourite> searchByFavourites(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}



//	@Override
//	public Favourite searchByName(String name) {
//		  
//				return favouriteRepository.findByName(name);
//	}


//
//	@Override
//	public List<Favourite> searchByFavourites(String userId) {
//		return favouriteRepository.findByFavourites(userId);
//	}	
//			


	

}
