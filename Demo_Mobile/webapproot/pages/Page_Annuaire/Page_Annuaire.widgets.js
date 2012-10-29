Page_Annuaire.widgets = {
	annuaireLiveVariable: ["wm.LiveVariable", {"designMaxResults":10,"ignoreCase":true,"matchMode":"anywhere","maxResults":10,"orderBy":"asc:nom","type":"com.metiersdb.data.Annuaire"}, {}, {
		liveView: ["wm.LiveView", {"dataType":"com.metiersdb.data.Annuaire","view":[{"caption":"Badge","sortable":true,"dataIndex":"badge","type":"java.lang.String","displayType":"Text","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":1000,"subType":null,"widthUnits":"px"},{"caption":"Prenom","sortable":true,"dataIndex":"prenom","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1001,"subType":null,"widthUnits":"px"},{"caption":"Nom","sortable":true,"dataIndex":"nom","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1002,"subType":null,"widthUnits":"px"},{"caption":"Email","sortable":true,"dataIndex":"email","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1003,"subType":null,"widthUnits":"px"},{"caption":"Poste","sortable":true,"dataIndex":"poste","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1004,"subType":null,"widthUnits":"px"},{"caption":"Telephone","sortable":true,"dataIndex":"telephone","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1005,"subType":null,"widthUnits":"px"},{"caption":"Bureau","sortable":true,"dataIndex":"bureau","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1006,"subType":null,"widthUnits":"px"},{"caption":"Societe","sortable":true,"dataIndex":"societe","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1007,"subType":null,"widthUnits":"px"},{"caption":"Service","sortable":true,"dataIndex":"service","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1008,"subType":null,"widthUnits":"px"},{"caption":"TelephoneSecretariat","sortable":true,"dataIndex":"telephoneSecretariat","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1009,"subType":null,"widthUnits":"px"},{"caption":"Adresse","sortable":true,"dataIndex":"adresse","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1010,"subType":null,"widthUnits":"px"},{"caption":"Ville","sortable":true,"dataIndex":"ville","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1011,"subType":null,"widthUnits":"px"},{"caption":"Cp","sortable":true,"dataIndex":"cp","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1012,"subType":null,"widthUnits":"px"}]}, {}],
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"search_Nom.dataValue","targetProperty":"filter.nom"}, {}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		annuaireLivePanel1: ["wm.LivePanel", {"autoScroll":false,"horizontalAlign":"left","verticalAlign":"top"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"source":"Annuaire_List","targetId":null,"targetProperty":"gridLayer"}, {}],
				wire1: ["wm.Wire", {"source":"Edit_Annuaire","targetId":null,"targetProperty":"detailsLayer"}, {}],
				wire2: ["wm.Wire", {"source":"annuaireLiveForm1","targetId":null,"targetProperty":"liveForm"}, {}],
				wire3: ["wm.Wire", {"source":"annuaireDojoGrid","targetId":null,"targetProperty":"dataGrid"}, {}],
				wire4: ["wm.Wire", {"source":"annuaireSaveButton","targetId":null,"targetProperty":"saveButton"}, {}]
			}],
			annuaireLayers: ["wm.BreadcrumbLayers", {}, {}, {
				Annuaire_List: ["wm.Layer", {"borderColor":"","caption":"Liste","horizontalAlign":"left","themeStyleType":"ContentPanel","verticalAlign":"top"}, {"onShow":"annuaireDojoGrid.deselectAll"}, {
					dataNavigator1: ["wm.DataNavigator", {"border":"0","height":"28px","horizontalAlign":"center","width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"annuaireLiveVariable","targetProperty":"liveSource"}, {}]
						}]
					}],
					annuaireDojoGrid: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":true,"field":"badge","title":"Badge","width":"40px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"prenom","title":"Prenom","width":"70px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"nom","title":"Nom","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"email","title":"Email","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"poste","title":"Poste","width":"40px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"telephone","title":"Telephone","width":"80px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"bureau","title":"Bureau","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"societe","title":"Societe","width":"70px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"service","title":"Service","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"telephoneSecretariat","title":"TelephoneSecretariat","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"adresse","title":"Adresse","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"ville","title":"Ville","width":"100px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"cp","title":"Cp","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"\"<div class='MobileRowTitle'>Badge: \" + ${badge} + \"</div>\"\n+ \"<div class='MobileRow'>Prenom: \" + ${prenom} + \"</div>\"\n+ \"<div class='MobileRow'>Nom: \" + ${nom} + \"</div>\"\n+ \"<div class='MobileRow'>Telephone: \" + ${telephone} + \"</div>\"\n+ \"<div class='MobileRow'>Service: \" + ${service} + \"</div>\"\n+ \"<div class='MobileRow'>Ville: \" + ${ville} + \"</div>\"\n\n","isCustomField":true,"mobileColumn":true},{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}],"headerVisible":false,"height":"100%","rightNavArrow":true,"styleAsGrid":false,"styles":{"fontSize":"undefinedpx"}}, {"onSelect":"annuaireLivePanel1.popupLivePanelEdit"}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"annuaireLiveVariable","targetProperty":"dataSet"}, {}]
						}]
					}],
					annuaireGridButtonPanel: ["wm.Panel", {"desktopHeight":"32px","enableTouchHeight":true,"height":"32px","horizontalAlign":"right","layoutKind":"left-to-right","mobileHeight":"40px","verticalAlign":"middle","width":"100%"}, {}, {
						search_Nom: ["wm.Text", {"caption":"Nom","captionSize":"50px","dataValue":undefined,"displayValue":"","resetButton":true,"selectOnClick":true,"width":"100%"}, {}],
						annuaireNewButton: ["wm.Button", {"caption":"Nouveau","margin":"4"}, {"onclick":"annuaireLivePanel1.popupLivePanelInsert"}]
					}]
				}],
				Edit_Annuaire: ["wm.Layer", {"autoScroll":true,"borderColor":"","caption":"Editer","horizontalAlign":"left","themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
					annuaireLiveForm1: ["wm.LiveForm", {"alwaysPopulateEditors":true,"desktopHeight":"346px","enableTouchHeight":true,"height":"346px","horizontalAlign":"left","liveEditing":false,"margin":"4","mobileHeight":"463px","verticalAlign":"top"}, {"onSuccess":"annuaireLivePanel1.popupLiveFormSuccess"}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"annuaireDojoGrid.selectedItem","targetProperty":"dataSet"}, {}]
						}],
						badgeEditor1: ["wm.Text", {"caption":"Badge","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"badge","height":"26px","required":true,"width":"100%"}, {}],
						prenomEditor1: ["wm.Text", {"caption":"Prenom","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"prenom","height":"26px","width":"100%"}, {}],
						nomEditor1: ["wm.Text", {"caption":"Nom","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"nom","height":"26px","width":"100%"}, {}],
						emailEditor1: ["wm.Text", {"caption":"Email","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"email","height":"26px","width":"100%"}, {}],
						posteEditor1: ["wm.Text", {"caption":"Poste","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"poste","height":"26px","width":"100%"}, {}],
						telephoneEditor1: ["wm.Text", {"caption":"Telephone","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"telephone","height":"26px","width":"100%"}, {}],
						bureauEditor1: ["wm.Text", {"caption":"Bureau","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"bureau","height":"26px","width":"100%"}, {}],
						societeEditor1: ["wm.Text", {"caption":"Societe","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"societe","height":"26px","width":"100%"}, {}],
						serviceEditor1: ["wm.Text", {"caption":"Service","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"service","height":"26px","width":"100%"}, {}],
						telephoneSecretariatEditor1: ["wm.Text", {"caption":"TelephoneSecretariat","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","displayValue":"","emptyValue":"emptyString","height":"26px","width":"100%"}, {}],
						adresseEditor1: ["wm.Text", {"caption":"Adresse","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"adresse","height":"26px","width":"100%"}, {}],
						villeEditor1: ["wm.Text", {"caption":"Ville","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"ville","height":"26px","width":"100%"}, {}],
						cpEditor1: ["wm.Text", {"caption":"Cp","captionSize":"140px","changeOnKey":true,"dataValue":"","desktopHeight":"26px","emptyValue":"emptyString","formField":"cp","height":"26px","width":"100%"}, {}]
					}],
					annuaireFormButtonPanel: ["wm.Panel", {"desktopHeight":"32px","enableTouchHeight":true,"height":"32px","horizontalAlign":"right","layoutKind":"left-to-right","mobileHeight":"40px","verticalAlign":"top","width":"100%"}, {}, {
						annuaireSaveButton: ["wm.Button", {"caption":"Enregistrer","margin":"4"}, {"onclick":"annuaireLiveForm1.saveDataIfValid"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":"${annuaireLiveForm1.invalid} || !${annuaireLiveForm1.isDirty}","targetId":null,"targetProperty":"disabled"}, {}]
							}]
						}],
						annuaireCancelButton: ["wm.Button", {"caption":"Annuler","margin":"4"}, {"onclick":"Annuaire_List"}],
						annuaireDeleteButton: ["wm.Button", {"caption":"Supprimer","margin":"4"}, {"onclick":"annuaireLiveForm1.deleteData"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"source":"annuaireDojoGrid.emptySelection","targetId":null,"targetProperty":"disabled"}, {}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}