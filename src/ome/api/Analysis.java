/*
 * ome.api.Analysis
 *
 *------------------------------------------------------------------------------
 *
 *  Copyright (C) 2005 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *------------------------------------------------------------------------------
 */

package ome.api;

// Java imports
import java.util.Map;
import java.util.Set;

// Third-party libraries

// Application-internal dependencies

/**
 * Provides access to the model objects involved in analysis.
 * 
 * @author Jean-Marie Burel &nbsp;&nbsp;&nbsp;&nbsp; <a
 *         href="mailto:j.burel@dundee.ac.uk">j.burel@dundee.ac.uk</a>
 * @author <br>
 *         Josh Moore &nbsp;&nbsp;&nbsp;&nbsp; <a
 *         href="mailto:josh.moore@gmx.de"> josh.moore@gmx.de</a>
 * @version 1.0 <small> (<b>Internal version:</b> $Revision: $ $Date: $)
 *          </small>
 * @since OME1.0
 */
public interface Analysis {

	// TODO plural arguments for each
	public Set getProjectsForUser(int experimenterId); // TODO or map?
	public Set getDatasetsForProject(int projectId);
	public Set getAllDatasets();
	public Set getProjectsForDataset(int datasetId);
	public Set getImagesForDataset(int datasetId );
	public Set getAllForImage(int imageId);
	public Set getChainExecutionsForDataset(int datasetId);
	

//    1) all of the projects for a user,
//    2) for each prioject, a list of all datasets.
//    3) all datasets,
//    4) for each dataset, a list of projects
//    5) for each datasets ,  a list of images.
//    6) for an image, all of the datasets that contain it, thumbnails,
//and metadata.
//    7) for each datasets, a list of chain executions. 
//	
//	analysis_chains
//
//    with id, name, description, locked
//analysis_chain_nodes
//    node_id, chain_id, module_id
//modules
//    module_id, name, category, description
//analysis_chain_links
//    link id, chain_id, from_node, to_node, from_output,to_input
//formal inputs
//    formal input id, semantic type id,name, module id, description
//formal_outptuts
//    formal output id, st id, name, module id, description
//analysis_chain_executions
//    analysis chain exeuction id, analysis_chain_execution_id, dataset id,
//    timestamp, experimenter id.
//module_executions.
//    module execution id,image id, dataset id, timestamp, virtual mex
//sts
//    semantic_type_id, name, description.
//     

}