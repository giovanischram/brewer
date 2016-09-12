package com.schram.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schram.brewer.model.Style;

@ResponseBody
public interface Styles extends JpaRepository<Style, Long> {

}