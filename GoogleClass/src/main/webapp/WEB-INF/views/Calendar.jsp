<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.seon.project.model.CalendarVO" %>
<% List<CalendarVO> list = (ArrayList<CalendarVO>)request.getAttribute("showSchedule"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<link href='https://use.fontawesome.com/releases/v5.0.6/css/all.css' rel='stylesheet'>
<link href='/resources/fullcalendar/lib/main.css' rel='stylesheet' />
<script src='/resources/fullcalendar/lib/main.js'></script>
<script src='/resources/fullcalendar/js/theme-chooser.js'></script>
<script>
  document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');
    var calendar;

    initThemeChooser({

      init: function(themeSystem) {
        calendar = new FullCalendar.Calendar(calendarEl, {
          themeSystem: themeSystem,
          headerToolbar: {
            left: 'prev,next today',
            center: 'title',
            right: 'dayGridMonth,timeGridWeek,timeGridDay,listMonth'
          },
          initialDate: '2020-11-01',
          weekNumbers: true,
          navLinks: true, // can click day/week names to navigate views
          editable: true,
          selectable: true,
          nowIndicator: true,
          dayMaxEvents: true, // allow "more" link when too many events
          // showNonCurrentDates: false,
          events: [
	{
              title: 'All Day Event',
              start: '2020-11-01'
            }, 
            {
                groupId: 999,
                title: '프로그래밍언어분석',
                start: '2020-10-27T10:30:00',
                end : '2020-10-27T13:15:00'
              },
            {
              groupId: 999,
              title: '프로그래밍언어분석',
              start: '2020-11-03T10:30:00',
              end : '2020-10-27T13:15:00'
              
            },
            {
              groupId: 999,
              title: '프로그래밍언어분석',
              start: '2020-11-10T10:30:00',
              end : '2020-10-27T13:15:00'
            },
            {
            	groupId: 999,
                title: '프로그래밍언어분석',
                start: '2020-11-17T10:30:00',
                end : '2020-10-27T13:15:00'
            },
            {
            	groupId: 999,
                title: '프로그래밍언어분석',
                start: '2020-11-24T10:30:00',
                end : '2020-10-27T13:15:00'
            },
            {
            	groupId: 999,
                title: '프로그래밍언어분석',
                start: '2020-12-01T10:30:00',
                end : '2020-10-27T13:15:00'
            },
            {
                groupId: 998,
                title: '캡스톤',
                start: '2020-10-27T15:00:00',
                end : '2020-10-27T17:45:00'
              },
            {
              groupId: 998,
              title: '캡스톤',
              start: '2020-11-03T15:00:00',
              end : '2020-11-03T17:45:00'
            },
            {
              groupId: 998,
              title: '캡스톤',
              start: '2020-11-107T15:00:00',
              end : '2020-11-10T17:45:00'
            },
            {
            	groupId: 998,
            	title: '캡스톤',
                start: '2020-11-17T15:00:00',
                end : '2020-11-17T17:45:00'
            },
            {
            	groupId: 998,
            	title: '캡스톤',
                start: '2020-11-24T15:00:00',
                end : '2020-11-24T17:45:00'
            },
            {
            	groupId: 998,
            	title: '캡스톤',
                start: '2020-12-01T15:00:00',
                end : '2020-12-01T17:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-10-28T10:35:00',
                end : '2020-10-28T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-10-29T10:35:00',
                end : '2020-10-29T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-04T10:35:00',
                end : '2020-11-04T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-05T10:35:00',
                end : '2020-11-05T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-11T10:35:00',
                end : '2020-11-11T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-12T10:35:00',
                end : '2020-11-12T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-18T10:35:00',
                end : '2020-11-18T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-19T10:35:00',
                end : '2020-11-19T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-25T10:35:00',
                end : '2020-11-25T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-11-26T10:35:00',
                end : '2020-11-26T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-12-02T10:35:00',
                end : '2020-12-02T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소프트웨어와경영',
                start: '2020-12-03T10:35:00',
                end : '2020-12-03T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소경 발표',
                start: '2020-12-03T10:35:00',
                end : '2020-12-03T11:45:00'
            },
            {
            	groupId: 997,
            	title: '소경 3주차 과제',
                start: '2020-09-18T00:00:00',
                end : '2020-09-18T23:59:59'
            },
            {
            	groupId: 997,
            	title: '소경 6주차 과제',
                start: '2020-10-08T00:00:00',
                end : '2020-10-08T23:59:59'
            },
            {
            	groupId: 997,
            	title: '소경 7주차 과제',
                start: '2020-10-15T00:00:00',
                end : '2020-10-15T23:59:59'
            },
            {
              title: 'Birthday Party',
              start: '2020-09-13T07:00:00'
            }
          ]
        });

        calendar.render();
      },

      change: function(themeSystem) {
        calendar.setOption('themeSystem', themeSystem);
      }

    });

  });

</script>
<style>

  body {
    margin: 0;
    padding: 0;
    font-size: 14px;
  }

  #top,
  #calendar.fc-theme-standard {
    font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
  }

  #calendar.fc-theme-bootstrap {
    font-size: 14px;
  }

  #top {
    background: #eee;
    border-bottom: 1px solid #ddd;
    padding: 0 10px;
    line-height: 40px;
    font-size: 12px;
    color: #000;
  }

  #top .selector {
    display: inline-block;
    margin-right: 10px;
  }

  #top select {
    font: inherit; /* mock what Boostrap does, don't compete  */
  }

  .left { float: left }
  .right { float: right }
  .clear { clear: both }

  #calendar {
    max-width: 1100px;
    margin: 40px auto;
    padding: 0 10px;
  }

</style>
</head>
<body>

  <div id='top'>

    <div class='left'><div id='theme-system-selector' class='selector'>
       <div id='theme-system-selector' class='selector'>
       Theme System:
        <select>
          <option value='bootstrap' selected>Bootstrap 4</option>
          <option value='standard'>unthemed</option>
        </select>
        
      </div>
      </div>

      <div data-theme-system="bootstrap" class='selector' style='display:none'>
        Theme Name:

        <select>
          <option value='' selected>Default</option>
          <option value='cerulean'>Cerulean</option>
          <option value='cosmo'>Cosmo</option>
          <option value='cyborg'>Cyborg</option>
          <option value='darkly'>Darkly</option>
          <option value='flatly'>Flatly</option>
          <option value='journal'>Journal</option>
          <option value='litera'>Litera</option>
          <option value='lumen'>Lumen</option>
          <option value='lux'>Lux</option>
          <option value='materia'>Materia</option>
          <option value='minty'>Minty</option>
          <option value='pulse'>Pulse</option>
          <option value='sandstone'>Sandstone</option>
          <option value='simplex'>Simplex</option>
          <option value='sketchy'>Sketchy</option>
          <option value='slate'>Slate</option>
          <option value='solar'>Solar</option>
          <option value='spacelab'>Spacelab</option>
          <option value='superhero'>Superhero</option>
          <option value='united'>United</option>
          <option value='yeti'>Yeti</option>
        </select>
      </div>

      <span id='loading' style='display:none'>loading theme...</span>

    </div>

    <div class='right'>
      <span class='credits' data-credit-id='bootstrap-standard' style='display:none'>
        <a href='https://getbootstrap.com/docs/3.3/' target='_blank'>Theme by Bootstrap</a>
      </span>
      <span class='credits' data-credit-id='bootstrap-custom' style='display:none'>
        <a href='https://bootswatch.com/' target='_blank'>Theme by Bootswatch</a>
      </span>
    </div>

    <div class='clear'></div>
  </div>

  <div id='calendar'></div>

</body>
</html>
