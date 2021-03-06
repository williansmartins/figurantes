jQuery(document).ready(function($) {
  "use strict";

  //popular campos
  popularCampos();

  //Contact
  $('form.registerForm').submit(function() {
    var f = $(this).find('.form-group'),
      ferror = false,
      emailExp = /^[^\s()<>@,;:\/]+@\w[\w\.-]+\.[a-z]{2,}$/i;

    f.children('input').each(function() { // run all inputs

      var i = $(this); // current input
      var rule = i.attr('data-rule');

      if (rule !== undefined) {
        var ierror = false; // error flag for current input
        var pos = rule.indexOf(':', 0);
        if (pos >= 0) {
          var exp = rule.substr(pos + 1, rule.length);
          rule = rule.substr(0, pos);
        } else {
          rule = rule.substr(pos + 1, rule.length);
        }

        switch (rule) {
          case 'required':
            if (i.val() === '') {
              ferror = ierror = true;
            }
            break;

          case 'minlen':
            if (i.val().length < parseInt(exp)) {
              ferror = ierror = true;
            }
            break;

          case 'email':
            if (!emailExp.test(i.val())) {
              ferror = ierror = true;
            }
            break;

          case 'checked':
            if (! i.is(':checked')) {
              ferror = ierror = true;
            }
            break;

          case 'regexp':
            exp = new RegExp(exp);
            if (!exp.test(i.val())) {
              ferror = ierror = true;
            }
            break;
        }
        i.next('.validation').html((ierror ? (i.attr('data-msg') !== undefined ? i.attr('data-msg') : 'wrong Input') : '')).show('blind');
      }
    });
    f.children('textarea').each(function() { // run all inputs

      var i = $(this); // current input
      var rule = i.attr('data-rule');

      if (rule !== undefined) {
        var ierror = false; // error flag for current input
        var pos = rule.indexOf(':', 0);
        if (pos >= 0) {
          var exp = rule.substr(pos + 1, rule.length);
          rule = rule.substr(0, pos);
        } else {
          rule = rule.substr(pos + 1, rule.length);
        }

        switch (rule) {
          case 'required':
            if (i.val() === '') {
              ferror = ierror = true;
            }
            break;

          case 'minlen':
            if (i.val().length < parseInt(exp)) {
              ferror = ierror = true;
            }
            break;
        }
        i.next('.validation').html((ierror ? (i.attr('data-msg') != undefined ? i.attr('data-msg') : 'wrong Input') : '')).show('blind');
      }
    });

    if (ferror) return false;
    else var str = $(this).serialize();
    var action = $(this).attr('action');
    if( ! action ) {
      action = 'http://localhost:9090/figurantes';
    }

    //alert("opa, clicou em mim");

    //var data = str;
    // var $form = $(this);
    // var data = JSON.stringify(getFormData($form));

    var data = JSON.stringify({
      "nome": $("#nome").val(),
      "idade": $("#idade").val(),
      "genero": $("#genero").val(),
      "etinia": $("#etinia").val(),
      "altura": $("#altura").val(),
      "peso": $("#peso").val(),
      "email": $("#email").val(),
      "senha": $("#senha").val(),
      "cpf": $("#cpf").val(),
      "endereco": {
        "cidade": $("#cidade").val(),
        "estado": $("#estado").val()
      }
    });
    
    $.ajax({
      type: "POST",
      url: action,
      dataType: 'json',
      contentType: "application/json",
      data: data,
      success: function(msg) {
        //alert(msg);
        if (msg == 'OK') {
          $("#sendmessage").addClass("show");
          $("#errormessage").removeClass("show");
          $('.contactForm').find("input, textarea").val("");
        } else {
          $("#sendmessage").removeClass("show");
          $("#errormessage").addClass("show");
          $('#errormessage').html(msg);
        }

      }
    });
    return false;
  });

});


function popularCampos(){
  $("#nome").val("Willians Martins de Morais");
  $("#cpf").val("333.666.999-88");
  $("#email").val("professorwillians@gmail.com");
  $("#senha").val("secreta");
  $("#idade").val("37");
  $("#etinia").val("pardo");
  $("#genero").val("m");
  $("#altura").val("1.78");
  $("#peso").val("80.00");
  $("#cidade").val("Itapevi");
  $("#estado").val("São Paulo");
  $("#caracteristicas").val("sem tatuagem");
}

function getFormData($form){
  var unindexed_array = $form.serializeArray();
  var indexed_array = {};

  $.map(unindexed_array, function(n, i){
      indexed_array[n['name']] = n['value'];
  });

  return indexed_array;
}