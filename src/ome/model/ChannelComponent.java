package ome.model;

import ome.util.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * ChannelComponent generated by hbm2java
 */
public class
ChannelComponent 
implements java.io.Serializable ,
ome.api.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer attributeId;
     private Integer index;
     private String colorDomain;
     private ImagePixel imagePixel;
     private LogicalChannel logicalChannel;
     private Image image;
     private ModuleExecution moduleExecution;


    // Constructors

    /** default constructor */
    public ChannelComponent() {
    }
    
    /** constructor with id */
    public ChannelComponent(Integer attributeId) {
        this.attributeId = attributeId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * 
     */
    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 
     */
    public String getColorDomain() {
        return this.colorDomain;
    }
    
    public void setColorDomain(String colorDomain) {
        this.colorDomain = colorDomain;
    }

    /**
     * 
     */
    public ImagePixel getImagePixel() {
        return this.imagePixel;
    }
    
    public void setImagePixel(ImagePixel imagePixel) {
        this.imagePixel = imagePixel;
    }

    /**
     * 
     */
    public LogicalChannel getLogicalChannel() {
        return this.logicalChannel;
    }
    
    public void setLogicalChannel(LogicalChannel logicalChannel) {
        this.logicalChannel = logicalChannel;
    }

    /**
     * 
     */
    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     */
    public ModuleExecution getModuleExecution() {
        return this.moduleExecution;
    }
    
    public void setModuleExecution(ModuleExecution moduleExecution) {
        this.moduleExecution = moduleExecution;
    }





	/** utility methods. Container may re-assign this. */	
	protected static ome.util.BaseModelUtils _utils = 
		new ome.util.BaseModelUtils();
	public BaseModelUtils getUtils(){
		return _utils;
	}
	public void setUtils(BaseModelUtils utils){
		_utils = utils;
	}

  public boolean acceptFilter(Filter filter){


	  // Visiting: AttributeId ------------------------------------------
	  Integer _AttributeId = null;
	  try {
	     _AttributeId = getAttributeId();
	  } catch (Exception e) {
		 setAttributeId(null);
	  }
// TODO catch class cast?
	  setAttributeId((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):AttributeId",_AttributeId)); 

	  // Visiting: Index ------------------------------------------
	  Integer _Index = null;
	  try {
	     _Index = getIndex();
	  } catch (Exception e) {
		 setIndex(null);
	  }
// TODO catch class cast?
	  setIndex((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):Index",_Index)); 

	  // Visiting: ColorDomain ------------------------------------------
	  String _ColorDomain = null;
	  try {
	     _ColorDomain = getColorDomain();
	  } catch (Exception e) {
		 setColorDomain(null);
	  }
// TODO catch class cast?
	  setColorDomain((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):ColorDomain",_ColorDomain)); 

	  // Visiting: ImagePixel ------------------------------------------
	  ImagePixel _ImagePixel = null;
	  try {
	     _ImagePixel = getImagePixel();
	  } catch (Exception e) {
		 setImagePixel(null);
	  }
// TODO catch class cast?
	  setImagePixel((ImagePixel) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):ImagePixel",_ImagePixel)); 

	  // Visiting: LogicalChannel ------------------------------------------
	  LogicalChannel _LogicalChannel = null;
	  try {
	     _LogicalChannel = getLogicalChannel();
	  } catch (Exception e) {
		 setLogicalChannel(null);
	  }
// TODO catch class cast?
	  setLogicalChannel((LogicalChannel) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):LogicalChannel",_LogicalChannel)); 

	  // Visiting: Image ------------------------------------------
	  Image _Image = null;
	  try {
	     _Image = getImage();
	  } catch (Exception e) {
		 setImage(null);
	  }
// TODO catch class cast?
	  setImage((Image) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):Image",_Image)); 

	  // Visiting: ModuleExecution ------------------------------------------
	  ModuleExecution _ModuleExecution = null;
	  try {
	     _ModuleExecution = getModuleExecution();
	  } catch (Exception e) {
		 setModuleExecution(null);
	  }
// TODO catch class cast?
	  setModuleExecution((ModuleExecution) filter.filter("org.hibernate.mapping.RootClass(ome.model.ChannelComponent):ModuleExecution",_ModuleExecution)); 
   	 return true;
  }
  
  public String toString(){
	return "ChannelComponent"+(attributeId==null ? ":Hash"+this.hashCode() : ":"+attributeId);
  }
  


}