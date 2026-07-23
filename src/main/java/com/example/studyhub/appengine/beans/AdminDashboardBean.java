package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.dto.DashboardStats;
import com.example.studyhub.appengine.services.AdminDashboardService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.line.LineChartDataSet;
import org.primefaces.model.charts.line.LineChartModel;

import java.io.Serial;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Named
@ViewScoped
@Getter
@Setter
public class AdminDashboardBean implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Inject
    private AdminDashboardService dashboardService;

    private DashboardStats stats;

    private BarChartModel usersChartModel;
    private LineChartModel gradesChartModel;

    @PostConstruct
    public void init() {
        stats = dashboardService.getDashboard();
        createUsersChart();
        createGradesChart();
    }

    private void createUsersChart() {
        usersChartModel = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet dataSet = new BarChartDataSet();
        dataSet.setLabel("Utilizatori Înregistrați");

        Map<Integer, Long> monthlyData = dashboardService.getMonthlyUserRegistrations();
        List<Number> values = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        String[] months = new DateFormatSymbols(new Locale("ro")).getShortMonths();

        for (int i = 1; i <= 12; i++) {
            labels.add(months[i - 1]);
            values.add(monthlyData.getOrDefault(i, 0L));
        }

        dataSet.setData(values);
        dataSet.setBackgroundColor("rgba(33, 150, 243, 0.5)");
        dataSet.setBorderColor("rgb(33, 150, 243)");
        dataSet.setBorderWidth(1);

        data.addChartDataSet(dataSet);
        data.setLabels(labels);
        usersChartModel.setData(data);
    }

    private void createGradesChart() {
        gradesChartModel = new LineChartModel();
        ChartData data = new ChartData();

        LineChartDataSet dataSet = new LineChartDataSet();
        dataSet.setLabel("Note Introduse");

        Map<Integer, Long> monthlyData = dashboardService.getMonthlyGrades();
        List<Object> values = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        String[] months = new DateFormatSymbols(new Locale("ro")).getShortMonths();

        for (int i = 1; i <= 12; i++) {
            labels.add(months[i - 1]);
            values.add(monthlyData.getOrDefault(i, 0L));
        }

        dataSet.setData(values);
        dataSet.setFill(false);
        dataSet.setBorderColor("rgb(76, 175, 80)");
        dataSet.setTension(0.3);

        data.addChartDataSet(dataSet);
        data.setLabels(labels);
        gradesChartModel.setData(data);
    }
}
