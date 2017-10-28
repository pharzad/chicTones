/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chic.repositories;

import com.chic.models.ArtistModel;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author farzadaziminia
 */
@RepositoryRestResource(collectionResourceRel = "artist", path = "artists")
public interface ArtistRepo  extends MongoRepository<ArtistModel, String> {
    
    List<ArtistModel> findByLastName(@Param("name") String name);

}
