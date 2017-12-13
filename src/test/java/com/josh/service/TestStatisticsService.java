package com.josh.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.josh.repository.DataRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestStatisticsService extends TestCase{

    public static int ALL_RECORDS_COUNT = 170350;
    public static long ALL_RECORDS_2015_COUNT = 14852;
    public static long ALL_RECORDS_UNITED_STATES_COUNT = 2758;
    public static String YEAR_2015 = "2015";
    public static String COUNTRY = "United States";

    @Mock
    private DataRepository dataRepository;

    @InjectMocks
    private StatisticsService statisticsService = new StatisticsService();

    @Override
    @Before
    protected void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Mockito.when(dataRepository.getTotalRecords()).thenReturn(ALL_RECORDS_COUNT);
        Mockito.when(dataRepository.getTotalRecordsForYear(YEAR_2015)).thenReturn(ALL_RECORDS_2015_COUNT);
        Mockito.when(dataRepository.getTotalRecordsForCountry(COUNTRY)).thenReturn(ALL_RECORDS_UNITED_STATES_COUNT);
    }

    @Test
    public void testGetTotalRecordsShouldReturnExpectedValue() {
        assertThat(statisticsService.getTotalEventsCount()).isEqualTo(ALL_RECORDS_COUNT);
    }

    @Test
    public void testGetTotalRecordsForYearShouldReturnExpectedValueWhenPassed2015() {
        assertThat(statisticsService.getTotalEventsCountForYear(YEAR_2015)).isEqualTo(ALL_RECORDS_2015_COUNT);
    }

    @Test
    public void testGetTotalRecordsForCountryShouldReturnExpectedValueWhenPassedUnitedStates() {
        assertThat(statisticsService.getTotalEventsCountForCountry(COUNTRY)).isEqualTo(ALL_RECORDS_UNITED_STATES_COUNT);
    }

}
