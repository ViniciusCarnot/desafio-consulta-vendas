package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.devsuperior.dsmeta.dto.SaleReportDTO;
import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public SaleMinDTO findById(Long id) {
		Optional<Sale> result = repository.findById(id);
		Sale entity = result.get();
		return new SaleMinDTO(entity);
	}

    @Transactional(readOnly = true)
    public List<SaleSummaryDTO> saleSummary(String minDate, String maxDate) {
        List<LocalDate> dates = verification(minDate, maxDate);
        return repository.searchSaleSummaryWithDates2(dates.get(0), dates.get(1));
    }

    @Transactional(readOnly = true)
    public Page<SaleReportDTO> saleReport(String minDate, String maxDate, String name, Pageable pageable) {
        List<LocalDate> dates = verification(minDate, maxDate);
        if(name == null) {
            return repository.searchLast12MonthsSaleReport(dates.get(0), dates.get(1), pageable);
        }
        return repository.searchSaleReport(dates.get(0), dates.get(1), name, pageable);
    }


    private List<LocalDate> verification(String minDate, String maxDate) {
        List<LocalDate> list = new ArrayList<>();
        LocalDate date2 = null;
        LocalDate date1 = null;
        if(maxDate == null || minDate.isBlank()) {
            date2 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
            if(minDate == null || minDate.isBlank()) {
                date1 = date2.minusYears(1L);
            }
            return Arrays.asList(date1, date2);
        }
        date1 = LocalDate.parse(minDate, DateTimeFormatter.ISO_DATE);
        date2 = LocalDate.parse(maxDate, DateTimeFormatter.ISO_DATE);
        return Arrays.asList(date1, date2);
    }

}
