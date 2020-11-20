## Getting Started:


###### Description
	
CA Service Catalog helps you expose service offerings where, when and how they are needed, whether mobile or in portals. Thanks to CA Service Catalog, end-users can request IT on non-IT services to be fulfilled.

Automic Service Orchestration automates any technical or business workflow. Thanks to its many integrations with infrastructure providers and applications, Automic can execute all the IT operations necessary to fulfill a service request.

By integrating CA Service Catalog with Automic, you can provide self-service offerings that will be fully automated. IT teams will have more time to spend on tasks that provide higher-value to the enterprise, and end-users will gain time by having services delivered super-fast.

The CA Service Catalog Plugin loads into CA Service Catalog. It allows service catalog designers to create service request forms that trigger Automic workflows.

	
###### Features:

    By integrating CA Service Catalog with Automic Automation, you can provide fully-automated, fast, and reliable self-service offerings. 
	Your users will be able to independently have their service requests fulfilled. More importantly, with routine tasks automated, your IT teams get more time for tasks that require their expertise and that provide higher value to the enterprise.
	Overall, implementing automated request fulfillment has the following advantages:

	1. Decreased time to resolution. The request fulfillment begins within seconds of submission and the IT tasks are executed at a fraction of the time for manual processing.
	2. Reliability. Like any automated process, automated fulfillment is less prone to error.
	3. Scalability. After successfully implementing an integration, you can quickly distribute it to other business units in your organization.


Steps to Install Bamboo Plugin:
	
1. Download the CA Service Catalog Plug-in from https://downloads.automic.com/marketplace/browse/clarity-sc-plugin
	2. Extract all files from the ZIP file.
	3. Copy the JAR  file to the following folder in your Tomcat installation for CA Service Catalog:
		<CA Service Catalog>\view\webapps\usm\WEB-INF\lib
		Where <CA Service Catalog> is the location of your installation for CA Service Catalog.
	4. Restart the Windows service for the web server for CA Service Catalog so that the contents of the JAR are added to the CA Service Catalog library.
		a. Open your Windows Services manager.
		b. Stop and restart the Windows service.
		
	Note: The JAR file contains a Java Class that can create and send REST calls for a service requests to the specified AE instance.

###### Setting up Development Environment:
    
  Install the Atlassian SDK on a [Windows](https://developer.atlassian.com/server/framework/atlassian-sdk/install-the-atlassian-sdk-on-a-windows-system/) or [Linux or Mac](https://developer.atlassian.com/server/framework/atlassian-sdk/install-the-atlassian-sdk-on-a-linux-or-mac-system/) system
		
  1. Java should be installed on the system
  2. Download the latest version of the SDK and follow the prompts to install the SDK
  3. Verify the SDK is installed using the command atlas-version
	
		
###### CA Service Catalog Plugin depends on

- Automation.Engine » AutomationEngine (minimum version Automation.Engine 12.2)
- Plugin.CA.ServiceCatalog 1.0.1

###### Copyright and License: 

Broadcom does not support, maintain or warrant Solutions, Templates, Actions and any other content published on the Community and is subject to Broadcom Community [Terms and Conditions](https://community.broadcom.com/termsandconditions)

###### Questions or Need Help? 

Join the [Automic Community Integrations](https://community.broadcom.com/communities/community-home?CommunityKey=83e49dd4-b93e-464a-a343-2bb1e51c13ec) to discuss this integration.

