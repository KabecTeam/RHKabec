//VALIDACION CHECKBOX
function validacion(formu, obj) {
  limite=1; //limite de checks a seleccionar
  num=0;
  if (obj.checked) {
    for (i=0; ele=document.getElementById(formu).children[i]; i++)
      if (ele.checked) num++;
  if (num>limite)
    obj.checked=false;
  }
}
