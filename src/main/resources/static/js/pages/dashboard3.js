//[Dashboard Javascript]

//Project:	Florence Admin - Responsive Admin Template
//Primary use:   Used only for the main dashboard (index.html)


$(function () {

  'use strict';
	
		$("#barchart1").sparkline([32,24,26,24,32,26,40,34,22,24,24,26,24,32,26], {
			type: 'bar',
			height: '38',
			width: '100%',
			barWidth: 6,
			barSpacing: 4,
			barColor: '#ea9715',
		});
		$("#barchart2").sparkline([24,32,26,40,34,22,24,22,24,34,32,38,22,24,22], {
			type: 'bar',
			height: '38',
			barWidth: 6,
			barSpacing: 4,
			barColor: '#007eff',
		});
		
	// bar chart
		$(".bar").peity("bar");	
	
	
	var options = {
        series: [{
          name: 'series1',
          data: [178, 223, 195, 201, 143, 189, 156, 155, 118, 167, 159]
        }],
        chart: {
		  foreColor: '#ffffff',
          height: 295,
			width: 600,
          type: 'line',
			offsetY: 0,
			offsetX: -50,
			zoom: {
            enabled: false
          },
        },
		colors:['#ffffff'],
        dataLabels: {
          enabled: false
        },
		tooltip: {
			theme: 'dark'
		  },
        stroke: {
          curve: 'smooth',
        },
			
		markers: {
			size: 0,
		},
        yaxis: {
          axisBorder: {
            show: false
          },
          axisTicks: {
            show: false,
          },
          labels: {
            show: false,
          }
        
        },
        xaxis: {
          axisBorder: {
            show: false
          },
          axisTicks: {
            show: false,
          },
          labels: {
            show: true,
            formatter: function (val) {
              return val ;
            }
          }
        
        },
		grid: {
			show: true,
			borderColor: '#5578ed',
			strokeDashArray: 0,
			position: 'back',
			xaxis: {
				lines: {
					show: false,
				}
			},   
			yaxis: {
				lines: {
					show: false
				}
			},  
			row: {
				colors: undefined,
				opacity: 0.5,
			},  
			column: {
				colors: undefined,
				opacity: 0.1
			},  
		}
      };

      var chart = new ApexCharts(document.querySelector("#statisticschart3"), options);
      chart.render();
	
	
	var options = {
        series: [{
            name: "Profit",
            data: [0, 40, 110, 70, 100, 60, 130, 55, 140, 125]
        }],
        chart: {
			foreColor:"#333333",
          height: 290,
          type: 'area',
          zoom: {
            enabled: false
          }
        },
		colors:['#ea9715'],
        dataLabels: {
          enabled: false,
        },
        stroke: {
          	show: true,
			curve: 'straight',
			lineCap: 'butt',
			colors: undefined,
			width: 4,
			dashArray: 0, 
        },		
		markers: {
			size: 5,
			colors: '#ffffff',
			strokeColors: '#ea9715',
			strokeWidth: 4,
			strokeOpacity: 0.9,
			strokeDashArray: 0,
			fillOpacity: 1,
			discrete: [],
			shape: "circle",
			radius: 5,
			offsetX: 0,
			offsetY: 0,
			onClick: undefined,
			onDblClick: undefined,
			hover: {
			  size: undefined,
			  sizeOffset: 3
			}
		},	
        grid: {
			borderColor: '#f7f7f7', 
          row: {
            colors: ['transparent'], // takes an array which will be repeated on columns
            opacity: 0
          },			
		  yaxis: {
			lines: {
			  show: true,
			},
			  		  
		  },
        },
		fill: {
			type: "gradient",
			gradient: {
			  shadeIntensity: 1,
			  opacityFrom: 0.01,
			  opacityTo: 1,
			  stops: [0, 90, 100]
			}
		  },
        xaxis: {
          categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
		  labels: {
			show: true,        
          },
          axisBorder: {
            show: true
          },
          axisTicks: {
            show: true
          },
          tooltip: {
            enabled: true,        
          },
        },
        yaxis: {
          labels: {
            show: false,
            formatter: function (val) {
              return val + "K";
            }
          }
        
        },
      };
      var chart = new ApexCharts(document.querySelector("#charts_widget_2_chart"), options);
      chart.render();
	
	
		var options = {
        series: [{
          name: 'series1',
          data: [118, 223, 195, 201, 153, 189, 176, 165, 150, 197, 159]
        }],
        chart: {
		  foreColor: '#5949d6',
          height: 275,
			width: 600,
          type: 'area',
			offsetY: 0,
			offsetX: -50,
			zoom: {
            enabled: false
          },
        },
		colors:['#5949d6'],
        dataLabels: {
          enabled: false
        },
		tooltip: {
			theme: 'dark'
		  },
        stroke: {
          curve: 'smooth',
        },
			
		markers: {
			size: 0,
		},
        yaxis: {
          axisBorder: {
            show: false
          },
          axisTicks: {
            show: false,
          },
          labels: {
            show: false,
          }
        
        },
        xaxis: {
          axisBorder: {
            show: false
          },
          axisTicks: {
            show: false,
          },
          labels: {
            show: false,
          }
        
        },
		grid: {
			show: false,   
			yaxis: {
				lines: {
					show: false
				}
			},  
			row: {
				colors: undefined,
				opacity: 0.5,
			},  
			column: {
				colors: undefined,
				opacity: 0.1
			},  
		}
      };

      var chart = new ApexCharts(document.querySelector("#statisticschart4"), options);
      chart.render();
	
	
	
	
	
	  window.Apex = {
		stroke: {
		  width: 2,
			curve: 'smooth',
		},
		markers: {
		  size: 0
		},
		tooltip: {
		  fixed: {
			enabled: true,
		  }
		}
	  };

	  var randomizeArray = function (arg) {
		var array = arg.slice();
		var currentIndex = array.length,
		  temporaryValue, randomIndex;

		while (0 !== currentIndex) {

		  randomIndex = Math.floor(Math.random() * currentIndex);
		  currentIndex -= 1;

		  temporaryValue = array[currentIndex];
		  array[currentIndex] = array[randomIndex];
		  array[randomIndex] = temporaryValue;
		}

		return array;
	  }

	  // data for the sparklines that appear below header area
	  var sparklineData = [47, 45, 54, 38, 56, 24, 65, 31, 37, 39, 62, 51, 35, 41, 35, 27, 93, 53, 61, 27, 54, 43, 19, 46];
	
			var optionsSpark1 = {
          series: [{
          data: randomizeArray(sparklineData)
        }],
          chart: {
          type: 'area',
          height: 40,
          sparkline: {
            enabled: true
          },
        },
        stroke: {
          curve: 'smooth',
        },
		colors:['#5949d6'],
        fill: {
          opacity: 0.3
        },
        xaxis: {
          crosshairs: {
            width: 1
          },
        },
        yaxis: {
          min: 0
        },
        };

        var chartSpark1 = new ApexCharts(document.querySelector("#chart-spark1"), optionsSpark1);
        chartSpark1.render();
	
		var optionsSpark2 = {
          series: [{
          data: randomizeArray(sparklineData)
        }],
          chart: {
          type: 'area',
          height: 40,
          sparkline: {
            enabled: true
          },
        },
        stroke: {
          curve: 'smooth',
        },
		colors:['#5949d6'],
        fill: {
          opacity: 0.3
        },
        xaxis: {
          crosshairs: {
            width: 1
          },
        },
        yaxis: {
          min: 0
        },
        };

        var chartSpark2 = new ApexCharts(document.querySelector("#chart-spark2"), optionsSpark2);
        chartSpark2.render();
	
	
		var optionsSpark3 = {
          series: [{
          data: randomizeArray(sparklineData)
        }],
          chart: {
          type: 'area',
          height: 40,
          sparkline: {
            enabled: true
          },
        },
        stroke: {
          curve: 'smooth',
        },
		colors:['#5949d6'],
        fill: {
          opacity: 0.3
        },
        xaxis: {
          crosshairs: {
            width: 1
          },
        },
        yaxis: {
          min: 0
        },
        };

        var chartSpark3 = new ApexCharts(document.querySelector("#chart-spark3"), optionsSpark3);
        chartSpark3.render();
	
	
		
		var optionDonut = {
	  chart: {
		  type: 'donut',
		  width: '100%',
		  height: 230
	  },
	  dataLabels: {
		enabled: true,
		  formatter: function (val) {
			  return val + "%"
			},
		   style: {
			  fontSize: '16px',
			  fontWeight: 'normal',
		  },
	  },
	  plotOptions: {
		pie: {
		  customScale: 0.9,
		  donut: {
			size: '50%',
		  },
		  offsetY: 0,
		},
		stroke: {
		  colors: undefined
		}
	  },
	  colors: ['#5949d6', '#007eff', '#2a8853', '#fb3d4e'],
	  series: [60, 8, 12, 20],
	  labels: ['Databases', 'Email Account', 'Domains', 'Data'],
	  legend: {
		show: true,
	  }
	}

	var donut = new ApexCharts(
	  document.querySelector("#shops-trend"),
	  optionDonut
	)
	donut.render();
	
	var options = {
          series: [{
            name: "Revenue",
            data: [60, 71, 75, 91, 80, 70]
        }],
          chart: {
          height: 150,
          type: 'area',
          zoom: {
            enabled: false
          },			  
		  toolbar: {
			show: false,
		  }
        },
        dataLabels: {
          enabled: false
        },
        stroke: {
          curve: 'stepline'
        },
		colors: ['#5949d6'],
        grid: {			
			show: false,
			padding: {
			  top: 0,
			  bottom: -20,
			  right: 0,
			  left: -10
			},
        },
		
		 legend: {
      		show: false,
		 },
        xaxis: {
          categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
			labels: {
          		show: false,
			},
			axisBorder: {
          		show: false,
			},
			axisTicks: {
          		show: false,
			},
        	},
		
        yaxis: {
          labels: {
          		show: false,
			}
        },
        };

        var chart = new ApexCharts(document.querySelector("#revenue1"), options);
        chart.render();
	
	
	
	
	
	var options = {
          series: [{
            name: "Revenue",
            data: [91, 80, 70, 60, 71, 75]
        }],
          chart: {
          height: 150,
          type: 'area',
          zoom: {
            enabled: false
          },			  
		  toolbar: {
			show: false,
		  }
        },
        dataLabels: {
          enabled: false
        },
        stroke: {
          curve: 'stepline'
        },
		colors: ['#ea9715'],
        grid: {			
			show: false,
			padding: {
			  top: 0,
			  bottom: -20,
			  right: 0,
			  left: -10
			},
        },
		
		 legend: {
      		show: false,
		 },
        xaxis: {
          categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
			labels: {
          		show: false,
			},
			axisBorder: {
          		show: false,
			},
			axisTicks: {
          		show: false,
			},
        	},
		
        yaxis: {
          labels: {
          		show: false,
			}
        },
        };

        var chart = new ApexCharts(document.querySelector("#revenue2"), options);
        chart.render();
	

	
}); // End of use strict
