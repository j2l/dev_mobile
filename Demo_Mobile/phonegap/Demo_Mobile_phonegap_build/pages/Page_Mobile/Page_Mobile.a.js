dojo.declare("Page_Mobile", wm.Page, {
"preferredDevice": "phone",
start: function() {
},
_end: 0
});

Page_Mobile.widgets = {
phoneGapCall1: ["wm.PhoneGapCall", {"operation":"geolocation_getCurrentPosition"}, {}, {
input: ["wm.ServiceInput", {"type":"geolocation_getCurrentPositionInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":"true","targetProperty":"enableHighAccuracy"}, {}]
}]
}]
}],
navigationCall_Acceuil: ["wm.NavigationCall", {"operation":"gotoPage"}, {}, {
input: ["wm.ServiceInput", {"type":"gotoPageInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":"\"Main\"","targetProperty":"pageName"}, {}]
}]
}]
}],
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
panel1: ["wm.Panel", {"desktopHeight":"32px","enableTouchHeight":true,"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","mobileHeight":"40px","verticalAlign":"top","width":"100%"}, {}, {
button_Acceuil: ["wm.Button", {"caption":undefined,"height":"40px","imageIndex":58,"imageList":"app.silkIconList","margin":"4","width":"32px"}, {"onclick":"navigationCall_Acceuil"}],
vitesse: ["wm.Text", {"caption":"Vitesse","captionSize":"60px","displayValue":"","height":"35px","width":"50%"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall1.speed","targetProperty":"dataValue"}, {}]
}]
}],
altitude: ["wm.Text", {"caption":"Altitude","captionSize":"60px","displayValue":"","height":"35px","width":"50%"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall1.altitudeAccuracy","targetProperty":"dataValue"}, {}]
}]
}]
}],
gadgetGoogleMap1: ["wm.gadget.GoogleMap", {"latitudeField":"latitude","longitudeField":"longitude"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"phoneGapCall1","targetProperty":"dataSet"}, {}]
}]
}]
}]
};

Page_Mobile.prototype._cssText = '';
Page_Mobile.prototype._htmlText = '';