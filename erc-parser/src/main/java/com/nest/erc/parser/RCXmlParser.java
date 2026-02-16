package com.nest.erc.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Stack;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.commons.text.StringEscapeUtils;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.rc.Company;
import com.nest.erc.domain.alg.rc.DomainTable;
import com.nest.erc.domain.alg.rc.DomainTableEntry;
import com.nest.erc.domain.alg.rc.DomainTableKey;
import com.nest.erc.domain.alg.rc.DomainTableValue;
import com.nest.erc.domain.alg.rc.Field;
import com.nest.erc.domain.alg.rc.Form;
import com.nest.erc.domain.alg.rc.Forms;
import com.nest.erc.domain.alg.rc.LOB;
import com.nest.erc.domain.alg.rc.Locale;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.rc.RateBook;
import com.nest.erc.domain.alg.rc.RateBookColumn;
import com.nest.erc.domain.alg.rc.RateBookColumns;
import com.nest.erc.domain.alg.rc.RateBookTable;
import com.nest.erc.domain.alg.rc.RateBookTables;
import com.nest.erc.domain.alg.rc.RateTable;
import com.nest.erc.domain.alg.rc.RateTableEntry;
import com.nest.erc.domain.alg.rc.RateTableKey;
import com.nest.erc.domain.alg.rc.RateTableValue;
import com.nest.erc.domain.alg.rc.Resource;
import com.nest.erc.domain.alg.rc.Script;
import com.nest.erc.domain.alg.rc.State;
import com.nest.erc.domain.alg.rc.WorkBook;
import com.nest.erc.domain.constants.ERCConstants;

public class RCXmlParser {
static Stack<XmlConstruct> elements = new Stack<XmlConstruct>();
	
	public static void main(String[] args) {
        String fileName = "./input/RC-BP-CW-09012019-V01.xml";
        RCXmlParser parser = new RCXmlParser();
        RCWrapper rcWrapper= parser.parseXML(fileName);
    }
	public RCWrapper parseXML(String fileName) {
		RCWrapper rcWrapper = null;
		RateBook rateBook = null;
		WorkBook workBook = null;
		Company company = null;
		Locale locale = null;
		LOB lob = null;
		State state = null;
		RateBookTables ratebookTables =null;
		RateBookTable ratebookTable =null;
		RateBookColumns ratebookColumns = null;
		RateBookColumn ratebookColumn = null;
		Forms forms = null;
		Form form = null;
		Field field = null;
		Resource resource = null;
		Script script = null;
		DomainTable domainTable = null;
		DomainTableKey domainTableKey =null;
		DomainTableValue domainTableValue = null;
		DomainTableEntry domainTableEntry = null;
		RateTable rateTable = null;
		RateTableKey rateTableKey =null;
		RateTableValue rateTableValue = null;
		RateTableEntry rateTableEntry = null;
		
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty("javax.xml.stream.isCoalescing", true);
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while(xmlEventReader.hasNext()){
	            XMLEvent xmlEvent = xmlEventReader.nextEvent();
	            if (xmlEvent.isStartElement()){
	                   StartElement startElement = xmlEvent.asStartElement();
	                   
	                   if(startElement.getName().getLocalPart().equals(ERCConstants.RootNode)){
	                	   rcWrapper = new RCWrapper();
	                	   elements.push(rcWrapper); 
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Ratebook)){
	                	   rateBook = new RateBook();
                		   elements.push(rateBook);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Workbook)){
	                	   workBook = new WorkBook();
                		   elements.push(workBook);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Company)){
	                	   company = new Company();
                		   elements.push(company);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Locale)){
	                	   locale = new Locale();
                		   elements.push(locale);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LOB)){
	                	   lob = new LOB();
                		   elements.push(lob);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.State)){
	                	   state = new State();
                		   elements.push(state);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookTables)){
	                	   ratebookTables = new RateBookTables();
                		   elements.push(ratebookTables);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookTable)){
	                	   ratebookTable = new RateBookTable();
                		   elements.push(ratebookTable);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookColumns)){
	                	   ratebookColumns = new RateBookColumns();
                		   elements.push(ratebookColumns);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookColumn)){
	                	   ratebookColumn = new RateBookColumn();
                		   elements.push(ratebookColumn);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Forms)){
	                	   forms = new Forms();
                		   elements.push(forms);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Form)){
	                	   form = new Form();
                		   elements.push(form);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Field)){
	                	   field = new Field();
                		   elements.push(field);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Resource)){
	                	   resource = new Resource();
                		   elements.push(resource);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Script)){
	                	   script = new Script();
                		   elements.push(script);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTable)){
	                	   domainTable = new DomainTable();
                		   elements.push(domainTable);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableKey)){
	                	   domainTableKey = new DomainTableKey();
                		   elements.push(domainTableKey);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableValue)){
	                	   domainTableValue = new DomainTableValue();
                		   elements.push(domainTableValue);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableEntry)){
	                	   domainTableEntry = new DomainTableEntry();
                		   elements.push(domainTableEntry);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateTable)){
	                	   rateTable = new RateTable();
                		   elements.push(rateTable);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateTableKey)){
	                	   rateTableKey = new RateTableKey();
                		   elements.push(rateTableKey);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateTableValue)){
	                	   rateTableValue = new RateTableValue();
                		   elements.push(rateTableValue);
	                   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateTableEntry)){
	                	   rateTableEntry = new RateTableEntry();
                		   elements.push(rateTableEntry);
	                   }
	                   
	                   
	                   if( elements.peek() instanceof RateBook){
	                	   xmlEvent = processRateBook(xmlEventReader, xmlEvent, startElement);
	                   }
	                   if( elements.peek() instanceof WorkBook){
	                	   xmlEvent = processWorkBook(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Company){
	                	   xmlEvent = processCompany(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Locale){
	                	   xmlEvent = processLocale(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof LOB){
	                	   xmlEvent = processLOB(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof State){
	                	   xmlEvent = processState(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateBookTable){
	                	   xmlEvent = processRateBookTable(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateBookColumn){
	                	   xmlEvent = processRateBookColumn(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Form){
	                	   xmlEvent = processForm(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Field){
	                	   xmlEvent = processFields(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Resource){
	                	   xmlEvent = processResource(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof Script){
	                	   xmlEvent = processScript(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof DomainTable){
	                	   xmlEvent = processDomainTable(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof DomainTableKey){
	                	   xmlEvent = processDomainTableKey(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof DomainTableValue){
	                	   xmlEvent = processDomainTableValue(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof DomainTableEntry){
	                	   xmlEvent = processDomainTableEntry(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateTable){
	                	   xmlEvent = processRateTable(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateTableKey){
	                	   xmlEvent = processRateTableKey(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateTableValue){
	                	   xmlEvent = processRateTableValue(xmlEventReader, xmlEvent, startElement); 
	                   }
	                   if( elements.peek() instanceof RateTableEntry){
	                	   xmlEvent = processRateTableEntry(xmlEventReader, xmlEvent, startElement); 
	                   }

	               }
	               
	               if(xmlEvent.isEndElement()){
	                   processEndElement(xmlEvent);
	               }
            }
            
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return rcWrapper;
    }
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processRateBook(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((RateBook)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NewBusinessEffective)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setNewBusinessEffective(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NewBusinessExpiration)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setNewBusinessExpiration(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalEffective)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setRenewalEffective(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalExpiration)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setRenewalExpiration(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Published)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPublished(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Released)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setReleased(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutoPublish)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setAutoPublish(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxTabsPerLine)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setMaxTabsPerLine(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingProviderProgID)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setRatingProviderProgID(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AssemblyName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setAssemblyName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Exclusion)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setExclusion(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PriorId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPriorId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PriorId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPriorId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Revision)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setRevision(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CoveragePartsSequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setCoveragePartsSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.VisualStudioVersion)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setVisualStudioVersion(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PDRForms)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPdrForms(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PDRRating)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPdrRating(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBook)elements.peek()).setPdrRating(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processWorkBook(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((WorkBook)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ParentWorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setParentWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NavigationType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNavigationType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayModeLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setDisplayModeLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutomaticRatingLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAutomaticRatingLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRateLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ValidateLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setValidateLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoteLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoteLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DiaryLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setDiaryLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HelpLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHelpLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutomaticFormAttachment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAutomaticFormAttachment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateRoofOnly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRateRoofOnly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FullRateTabAction)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFullRateTabAction(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FullRateTabLetter)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFullRateTabLetter(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingModePremiumRollup)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRatingModePremiumRollup(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditWaivedARDModMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditWaivedARDModMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditCompletedARDModMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditCompletedARDModMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditPurgedARDModMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditPurgedARDModMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowMsg)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowMsg(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SuppressNotificationText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setSuppressNotificationText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.VaryingShortRateFactor)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setVaryingShortRateFactor(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ExpirationPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setExpirationPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ExpirationUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setExpirationUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOptionEndtColumn)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOptionEndtColumn(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumColumn)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumColumn(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumExcluded)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumExcluded(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOverride)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOverride(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxAddNamedInsuredDBATA)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMaxAddNamedInsuredDBATA(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxNamedInsuredDBATA)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMaxNamedInsuredDBATA(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddNamedInsuredDBATAText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAddNamedInsuredDBATAText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NamedInsuredDBATAText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNamedInsuredDBATAText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowAttachDBATA)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowAttachDBATA(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingModeToggle)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRatingModeToggle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabAuditTemplateLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabAuditTemplateLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencyNotApplicable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencyNotApplicable(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditTemplateFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditTemplateFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditSuspendedMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditSuspendedMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESIAgentTemplateFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiAgentTemplateFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESINamedInsuredTemplateFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiNamedInsuredTemplateFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESIAdditionalNamedInsuredTemplateFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiAdditionalNamedInsuredTemplateFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESIAgent)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiAgent(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESIAdditionalNamedInsured)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiAdditionalNamedInsured(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESINamedInsured)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEsiNamedInsured(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BackNavigation)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setBackNavigation(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BackLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setBackLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ForwardLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setForwardLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NamedInsuredText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNamedInsuredText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HeaderBasedGeneralInfo)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHeaderBasedGeneralInfo(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HidePolicyDetail)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHidePolicyDetail(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HideClearButton)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHideClearButton(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HideHeader)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHideHeader(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowRiskDetail)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowRiskDetail(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RoundingMethod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRoundingMethod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutoValidationFlags)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAutoValidationFlags(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AnniversaryRatingUseAnnDate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAnniversaryRatingUseAnnDate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditCompletedMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditCompletedMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditWaivedMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditWaivedMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditCreatedMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditCreatedMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HouseholdClientType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHouseholdClientType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryTextAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryTextAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabCovPartsLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabCovPartsLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HideAgentSelectAddress)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHideAgentSelectAddress(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PassRoofDataToCovParts)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPassRoofDataToCovParts(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryNewDisplayModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryNewDisplayModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryNewDisplayAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryNewDisplayAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryNewModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryNewModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryNewAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryNewAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryTextView)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryTextView(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryTextRemove)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryTextRemove(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryTextModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryTextModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabPolicySummaryTextAction)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabPolicySummaryTextAction(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Monoline)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMonoline(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CommentCols)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCommentCols(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CommentRows)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCommentRows(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabMessageIndicator)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabMessageIndicator(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HideClientLinks)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHideClientLinks(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowHouseholdSearch)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowHouseholdSearch(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ModifyHouseholdLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setModifyHouseholdLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AnniversaryRatingCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAnniversaryRatingCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MidTermEndtProcess)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMidTermEndtProcess(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MultiPolicyDiscountRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMultiPolicyDiscountRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutoRefreshData)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAutoRefreshData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowFormSummaries)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowFormSummaries(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AutoApply)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAutoApply(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AnniversaryRatingMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAnniversaryRatingMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AnniversaryRating)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAnniversaryRating(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MultipleRating)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMultipleRating(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReviewHonoredRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReviewHonoredRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HonorRatebookUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHonorRatebookUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HonorRatebookPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setHonorRatebookPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AgentTransferMessageRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAgentTransferMessageRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CancellationMethodCause)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCancellationMethodCause(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationCausePeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationCausePeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationCauseUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationCauseUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowHelpImage)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowHelpImage(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AgentText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAgentText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SearchAddressLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setSearchAddressLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SearchClientLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setSearchClientLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ViewAttachingLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setViewAttachingLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumTotalWrittenLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumTotalWrittenLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumWrittenLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumWrittenLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumPolicyTermLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumPolicyTermLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumRatebookTermLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumRatebookTermLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionTextApply)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionTextApply(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionTextSubmit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionTextSubmit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionTextComment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionTextComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionTextCause)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionTextCause(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionTextAction)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionTextAction(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabActionLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabActionLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabLetterLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabLetterLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabInitialLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTabInitialLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyHideLocale)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyHideLocale(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteHideLocale)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteHideLocale(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditOffsetMonthly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditOffsetMonthly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditOffsetQuarterly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditOffsetQuarterly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditOffsetSemiannual)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditOffsetSemiannual(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditOffsetAnnual)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditOffsetAnnual(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencyMonthly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencyMonthly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencyQuarterly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencyQuarterly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencySemiannual)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencySemiannual(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencyAnnual)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencyAnnual(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditFrequencyDefault)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAuditFrequencyDefault(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ApplyButtonText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setApplyButtonText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SuspendCancellation)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setSuspendCancellation(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SuspendRenewal)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setSuspendRenewal(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PastEffectiveUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPastEffectiveUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PastEffectivePeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPastEffectivePeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FutureEffectiveUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFutureEffectiveUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FutureEffectivePeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFutureEffectivePeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalUpdateUnitNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRenewalUpdateUnitNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumDecimals)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumDecimals(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PackageCoverage)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPackageCoverage(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOptionCancelShortRate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOptionCancelShortRate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOptionCancelProRate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOptionCancelProRate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOptionCancelFlat)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOptionCancelFlat(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumOptionEndorsement)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumOptionEndorsement(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremiumCoverage)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremiumCoverage(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumPremium)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinimumPremium(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddNamedInsuredAddressRequired)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAddNamedInsuredAddressRequired(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddNamedInsuredText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setAddNamedInsuredText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowAddNamedInsuredAddress)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowAddNamedInsuredAddress(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReleasePublishEvent)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReleasePublishEvent(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShortRateFactor)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShortRateFactor(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FutureEndorsementUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFutureEndorsementUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FutureEndorsementPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFutureEndorsementPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReinstatementUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReinstatementUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReinstatementPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReinstatementPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CancellationMethodNonPayment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCancellationMethodNonPayment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CancellationMethodUnderwriting)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCancellationMethodUnderwriting(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationNonPaymentPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationNonPaymentPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationNonPaymentUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationNonPaymentUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationUnderwritingPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationUnderwritingPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfCancellationUnderwritingUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfCancellationUnderwritingUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ProRateTermUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setProRateTermUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingTermUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRatingTermUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingTermPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRatingTermPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowUser)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowUser(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowAction)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowAction(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowHelp)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowHelp(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowPayPlan)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowPayPlan(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowLetter)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowLetter(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FlowInitial)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setFlowInitial(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowMessageSeverity)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowMessageSeverity(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowMessageSource)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowMessageSource(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowMessages)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowMessages(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowTabs)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowTabs(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowPremiumTotalWritten)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowPremiumTotalWritten(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowPremiumWritten)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowPremiumWritten(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowPremiumPolicyTerm)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowPremiumPolicyTerm(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowPremiumRatebookTerm)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowPremiumRatebookTerm(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowPremium)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowPremium(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowValidate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowValidate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowRate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowRate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowNote)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowNote(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ShowDiary)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setShowDiary(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PremiumFormat)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPremiumFormat(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ValidationMode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setValidationMode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingMode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRatingMode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ExternalProvider)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setExternalProvider(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfNonRenewalMaximumPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfNonRenewalMaximumPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfNonRenewalMaximumUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfNonRenewalMaximumUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfNonRenewalMinimumPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfNonRenewalMinimumPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.NoticeOfNonRenewalMinimumUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setNoticeOfNonRenewalMinimumUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReviewRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReviewRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReviewPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReviewPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ReviewUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setReviewUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRenewalRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRenewalPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PreRenewalRoutingId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPreRenewalRoutingId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PreRenewalPeriod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPreRenewalPeriod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PreRenewalUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPreRenewalUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewWithDefaultTerm)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRenewWithDefaultTerm(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteHideAgent)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteHideAgent(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteHideAdditionalInsured)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteHideAdditionalInsured(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteHidePriorPolicy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteHidePriorPolicy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberKey)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberKey(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberCheckDigit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberCheckDigit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberPattern)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberPattern(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberSystemName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberSystemName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberSystemType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberSystemType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberModifiable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberModifiable(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteNumberType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setQuoteNumberType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyHideAgent)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyHideAgent(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyHideAdditionalInsured)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyHideAdditionalInsured(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyHidePriorPolicy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyHidePriorPolicy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberKey)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberKey(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberRenewalIterationPattern)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberRenewalIterationPattern(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberCheckDigit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberCheckDigit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberPattern)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberPattern(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberSystemName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberSystemName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberSystemType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberSystemType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberModifiable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberModifiable(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyNumberType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setPolicyNumberType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RenewalStatusDefault)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setRenewalStatusDefault(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.EffectiveDateDefaultOffset)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEffectiveDateDefaultOffset(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.EffectiveDateDefaultType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setEffectiveDateDefaultType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxNamedInsureds)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMaxNamedInsureds(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxAgents)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMaxAgents(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinAgents)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setMinAgents(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermDefaultUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermDefaultUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermDefault)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermDefault(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermMaximumUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermMaximumUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermMaximum)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermMaximum(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermMinimumUnit)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermMinimumUnit(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TermMinimum)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTermMinimum(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ResourceName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setResourceName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.StateId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setStateId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LOBId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setLOBId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LocaleId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setLocaleId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CompanyId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setCompanyId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ParentWorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setParentWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((WorkBook)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }
		
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processCompany(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		  if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Company)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.VersionedId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setVersionedId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Effective)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setEffective(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Expiration)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setExpiration(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Created)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setCreated(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CreatedBy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setCreatedBy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Modified)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setModified(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Identifier)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setIdentifier(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Number)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WebSite)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setWebSite(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TaxId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setTaxId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TradeExchange)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setTradeExchange(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Symbol)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setSymbol(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CorporationType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setCorporationType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.YearOfIncorporation)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setYearOfIncorporation(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CountryOfIncorporation)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setCountryOfIncorporation(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.StateOfIncorporation)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setStateOfIncorporation(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CounselorType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setCounselorType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FinancialAdvisorType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setFinancialAdvisorType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SICCode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setSicCode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.GLCode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setGlCode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AnnualSales)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setAnnualSales(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Employees)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setEmployees(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ContactPreference)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setContactPreference(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WorkbookCompany)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Company)elements.peek()).setWorkbookCompany(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processLocale(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		  if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Locale)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Locale)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Locale)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Locale)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Code)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Locale)elements.peek()).setCode(xmlEvent.asCharacters().getData());
		       }
		   }
		  return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processLOB(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		  if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((LOB)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((LOB)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LocaleId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((LOB)elements.peek()).setLocaleId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((LOB)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }
		  return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processState(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		  if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((State)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((State)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((State)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Code)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((State)elements.peek()).setCode(xmlEvent.asCharacters().getData());
		       }
		   }
		  return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processRateBookTable(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((RateBookTable)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BureauRuleNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setBureauRuleNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookTable)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }
		  return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processRateBookColumn(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((RateBookColumn)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingRequired)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setRatingRequired(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatingRequiredCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setRatingRequiredCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setColumnName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateBookColumn)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }
		  return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processForm(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Form)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setRateBookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.SubSequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setSubSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ParentName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setParentName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HidePremium)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setHidePremium(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Condition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Number)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TreeItemLabel)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTreeItemLabel(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TreeItemHoverText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTreeItemHoverText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinOccurs)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setMinOccurs(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaxOccurs)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setMaxOccurs(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BureauRuleNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBureauRuleNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TemplateFile)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTemplateFile(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Hidden)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setHidden(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTabCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TabResourceName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setTabResourceName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblAdd)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblAdd(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblModify)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblModify(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResDelete)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResDelete(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndDelete)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndDelete(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblDelete)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblDelete(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResViewDetail)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResViewDetail(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblViewDetail)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblViewDetail(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResCopy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResCopy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndCopy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndCopy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblCopy)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblCopy(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResRenumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResRenumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndRenumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndRenumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblRenumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblRenumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnResView)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnResView(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnCndView)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnCndView(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BtnLblView)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBtnLblView(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BeforeScript)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBeforeScript(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BeforeScriptData)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBeforeScriptData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AfterScript)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAfterScript(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AfterScriptData)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAfterScriptData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayMode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setDisplayMode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayModeCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setDisplayModeCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.CombineWithDetail)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setCombineWithDetail(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BackToTop)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBackToTop(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BackToTopLbl)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setBackToTopLbl(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AttachmentCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAttachmentCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AttachmentXPath)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAttachmentXPath(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AttachmentSequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setAttachmentSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Variable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setVariable(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Scheduled)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Form)elements.peek()).setScheduled(xmlEvent.asCharacters().getData());
		       }
		   }
		   return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processFields(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Field)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FormId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setFormId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.FormId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setFormId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setColumnName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDomainTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TextAreaRows)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setTextAreaRows(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TextAreaCols)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setTextAreaCols(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TextDisplaySize)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setTextDisplaySize(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Label)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   String label = StringEscapeUtils.unescapeHtml4(xmlEvent.asCharacters().getData());
		    	   label= label!=null?label.trim():label;
		    	   ((Field)elements.peek()).setLabel(label);
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteReadOnly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setQuoteReadOnly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteRequired)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setQuoteRequired(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteDisplay)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setQuoteDisplay(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.QuoteDisabled)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setQuoteDisabled(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyReadOnly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setPolicyReadOnly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyRequired)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setPolicyRequired(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyDisplay)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setPolicyDisplay(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PolicyDisabled)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setPolicyDisabled(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Default)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDefaultValue(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Minimum)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setMinimum(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Maximum)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setMaximum(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Mask)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setMask(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LinkText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setLinkText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Help)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setHelp(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.HelpText)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setHelpText(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BureauRuleNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setBureauRuleNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ViewResourceId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setViewResourceId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ModifyResourceId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setModifyResourceId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Condition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RequiredCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setRequiredCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AmendablePostIssuance)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAmendablePostIssuance(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AmendablePreRenewal)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAmendablePreRenewal(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayColumns)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayColumns(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayController)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayController(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayControllerTriggerRate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayControllerTriggerRate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Auditable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAuditable(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditViewOnly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAuditViewOnly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AuditCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAuditCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.XslValue)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setXslValue(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RefTableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setRefTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BeforeScript)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setBeforeScript(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AfterScript)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAfterScript(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AfterScriptData)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setAfterScriptData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ChangeScript)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setChangeScript(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ChangeScriptData)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setChangeScriptData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDomainTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DialogFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDialogFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DialogFileType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDialogFileType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LOBTabName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setLobTabName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LOBTabSequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setLobTabSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LOBTabCoveragePart)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setLobTabCoveragePart(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayMode)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayMode(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayModeCondition)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayModeCondition(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayModeReadOnly)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setDisplayModeReadOnly(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESITemplateFileName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setEsiTemplateFileName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ESILabelsDefinedInTemplate)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setEsiLabelsDefinedInTemplate(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.PrintRequired)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Field)elements.peek()).setPrintRequired(xmlEvent.asCharacters().getData());
		       }
		   }
		   return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private XMLEvent processResource(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
			   ((Resource)elements.peek()).setId(xmlEvent.asCharacters().getData());
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Resource)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }
		   return xmlEvent;
	}
	private XMLEvent processScript(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Data)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setData(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((Script)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }
		   return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processDomainTable(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		 	if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		 	}else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BureauRuleNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setBureauRuleNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AssemblyName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setAssemblyName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AssemblyType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setAssemblyType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AssemblyMethod)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setAssemblyMethod(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.XmlType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setXmlType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaskingTable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTable)elements.peek()).setMaskingTable(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processDomainTableKey(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DomainTableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setDomainTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Size)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableKey)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processDomainTableValue(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setTableType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableDescription)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setTableDescription(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setColumnName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setColumnType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnDescription)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setColumnDescription(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Size)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Scale)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableValue)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processDomainTableEntry(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DataValue)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setDataValue(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.DisplayValue)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setDisplayValue(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MinimumValue)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setMinimumValue(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaximumValue)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((DomainTableEntry)elements.peek()).setMaximumValue(xmlEvent.asCharacters().getData());
		       }
		   }else{
			   xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement() && !startElement.getName().getLocalPart().equals(ERCConstants.DomainTableEntry)){
		    	   ((DomainTableEntry)elements.peek()).getDomainKeyValues().put(startElement.getName().getLocalPart(), xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processRateTable(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Title)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setTitle(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.BureauRuleNumber)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setBureauRuleNumber(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Comment)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setComment(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.WorkbookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setWorkbookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.MaskingTable)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTable)elements.peek()).setMaskingTable(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processRateTableKey(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.Id)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.RateTableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setRateTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.LookupType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setLookupType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Name)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Size)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableKey)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/***
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processRateTableValue(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.TableId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setTableId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setTableName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setTableType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.TableDescription)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setTableDescription(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setColumnId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnName)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setColumnName(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnType)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setColumnType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.ColumnDescription)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setColumnDescription(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Type)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setType(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Size)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Scale)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableValue)elements.peek()).setSize(xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEventReader
	 * @param xmlEvent
	 * @param startElement
	 * @return
	 * @throws XMLStreamException
	 */
	private  XMLEvent processRateTableEntry(XMLEventReader xmlEventReader, XMLEvent xmlEvent, StartElement startElement)
			throws XMLStreamException {
		   
		   if(startElement.getName().getLocalPart().equals(ERCConstants.RatebookId)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableEntry)elements.peek()).setRatebookId(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.AddChangeDeleteFlag)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableEntry)elements.peek()).setAddChangeDeleteFlag(xmlEvent.asCharacters().getData());
		       }
		   }else if(startElement.getName().getLocalPart().equals(ERCConstants.Sequence)){
		       xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement()){
		    	   ((RateTableEntry)elements.peek()).setSequence(xmlEvent.asCharacters().getData());
		       }
		   }else{
			   xmlEvent = xmlEventReader.nextEvent();
		       if(!xmlEvent.isEndElement() && !startElement.getName().getLocalPart().equals(ERCConstants.RateTableEntry)){
		    	   ((RateTableEntry)elements.peek()).getRateTableKeyValues().put(startElement.getName().getLocalPart(), xmlEvent.asCharacters().getData());
		       }
		   }
		return xmlEvent;
	}
	/**
	 * 
	 * @param xmlEvent
	 */
	private  void processEndElement(XMLEvent xmlEvent) {
		EndElement endElement = xmlEvent.asEndElement();
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.Ratebook)){
			RateBook ratebook= ((RateBook)elements.pop());
			if(elements.peek() instanceof RCWrapper){
				((RCWrapper)elements.peek()).addChildren(ratebook);
			}
			if(elements.peek() instanceof RateBook){
				((RateBook)elements.peek()).addChildren(ratebook);
			}
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.Workbook)){
			WorkBook workBook= ((WorkBook)elements.pop());
			((RCWrapper)elements.peek()).addChildren(workBook);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.Company)){
			Company company= ((Company)elements.pop());
			((RCWrapper)elements.peek()).addChildren(company);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.Locale)){
			Locale locale= ((Locale)elements.pop());
			((RCWrapper)elements.peek()).addChildren(locale);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.LOB)){
			LOB lob= ((LOB)elements.pop());
			((RCWrapper)elements.peek()).addChildren(lob);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.State)){
			State state= ((State)elements.pop());
			if(elements.peek() instanceof RCWrapper) {
				((RCWrapper)elements.peek()).addChildren(state);
			}
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.RatebookTable)){
			RateBookTable rateBookTable= ((RateBookTable)elements.pop());
			((RateBookTables)elements.peek()).addChildren(rateBookTable);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.RatebookTables)){
			RateBookTables rateBookTables= ((RateBookTables)elements.pop());
			((RCWrapper)elements.peek()).addChildren(rateBookTables);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.RatebookColumn)){
			RateBookColumn rateBookColumn= ((RateBookColumn)elements.pop());
			((RateBookColumns)elements.peek()).addChildren(rateBookColumn);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.RatebookColumns)){
			RateBookColumns ratebookColumns= ((RateBookColumns)elements.pop());
			((RCWrapper)elements.peek()).addChildren(ratebookColumns);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.Field)){
			Field field= ((Field)elements.pop());
			((Form)elements.peek()).addChildren(field);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.Form)){
			Form form= ((Form)elements.pop());
			((Forms)elements.peek()).addChildren(form);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.Forms)){
			Forms forms= ((Forms)elements.pop());
			if(elements.peek() instanceof Form){
				((Form)elements.peek()).addChildren(forms);
			}
			if(elements.peek() instanceof RCWrapper){
				((RCWrapper)elements.peek()).addChildren(forms);
			}
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.Resource)){
			Resource resource= ((Resource)elements.pop());
			((RCWrapper)elements.peek()).addChildren(resource);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.Script)){
			Script script= ((Script)elements.pop());
			((RCWrapper)elements.peek()).addChildren(script);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.DomainTableKey)){
			DomainTableKey domainTableKey= ((DomainTableKey)elements.pop());
			((DomainTable)elements.peek()).addChildren(domainTableKey);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.DomainTableValue)){
			DomainTableValue domainTableValue= ((DomainTableValue)elements.pop());
			((DomainTable)elements.peek()).addChildren(domainTableValue);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.DomainTableEntry)){
			DomainTableEntry domainTableEntry= ((DomainTableEntry)elements.pop());
			((DomainTable)elements.peek()).addChildren(domainTableEntry);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.DomainTable)){
			DomainTable domainTable= ((DomainTable)elements.pop());
			((RCWrapper)elements.peek()).addChildren(domainTable);
		}
		
		if(endElement.getName().getLocalPart().equals(ERCConstants.RateTableKey)){
			RateTableKey rateTableKey= ((RateTableKey)elements.pop());
			((RateTable)elements.peek()).addChildren(rateTableKey);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.RateTableValue)){
			RateTableValue rateTableValue= ((RateTableValue)elements.pop());
			((RateTable)elements.peek()).addChildren(rateTableValue);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.RateTableEntry)){
			RateTableEntry rateTableEntry= ((RateTableEntry)elements.pop());
			((RateTable)elements.peek()).addChildren(rateTableEntry);
		}
		if(endElement.getName().getLocalPart().equals(ERCConstants.RateTable)){
			RateTable rateTable= ((RateTable)elements.pop());
			((RCWrapper)elements.peek()).addChildren(rateTable);
		}
	}
}


