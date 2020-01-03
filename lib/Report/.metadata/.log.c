!SESSION 2018-12-07 09:12:52.068 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.equinox.registry 4 2 2018-12-07 09:13:24.840
!MESSAGE Problems occurred when invoking code from plug-in: "org.eclipse.equinox.registry".
!STACK 0
org.eclipse.core.runtime.InvalidRegistryObjectException: Invalid registry object
	at org.eclipse.core.internal.registry.TemporaryObjectManager.getObject(TemporaryObjectManager.java:98)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtension(BaseExtensionHandle.java:30)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtensionPointUniqueIdentifier(BaseExtensionHandle.java:55)
	at org.eclipse.core.internal.registry.RegistryDelta.getExtensionDeltas(RegistryDelta.java:40)
	at org.eclipse.core.internal.registry.RegistryChangeEvent.getExtensionDeltas(RegistryChangeEvent.java:74)
	at org.eclipse.core.internal.preferences.PreferenceServiceRegistryHelper.registryChanged(PreferenceServiceRegistryHelper.java:255)
	at org.eclipse.core.internal.registry.ExtensionRegistry$2.run(ExtensionRegistry.java:922)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.registry.ExtensionRegistry.processChangeEvent(ExtensionRegistry.java:920)
	at org.eclipse.core.runtime.spi.RegistryStrategy.processChangeEvent(RegistryStrategy.java:260)
	at org.eclipse.core.internal.registry.osgi.ExtensionEventDispatcherJob.run(ExtensionEventDispatcherJob.java:50)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.registry 4 2 2018-12-07 09:13:24.865
!MESSAGE Problems occurred when invoking code from plug-in: "org.eclipse.equinox.registry".
!STACK 0
org.eclipse.core.runtime.InvalidRegistryObjectException: Invalid registry object
	at org.eclipse.core.internal.registry.TemporaryObjectManager.getObject(TemporaryObjectManager.java:98)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtension(BaseExtensionHandle.java:30)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtensionPointUniqueIdentifier(BaseExtensionHandle.java:55)
	at org.eclipse.core.internal.registry.RegistryDelta.getExtensionDeltas(RegistryDelta.java:40)
	at org.eclipse.core.internal.registry.RegistryChangeEvent.getExtensionDeltas(RegistryChangeEvent.java:74)
	at org.eclipse.core.internal.content.ContentTypeManager$ContentTypeRegistryChangeListener.registryChanged(ContentTypeManager.java:25)
	at org.eclipse.core.internal.registry.ExtensionRegistry$2.run(ExtensionRegistry.java:922)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.registry.ExtensionRegistry.processChangeEvent(ExtensionRegistry.java:920)
	at org.eclipse.core.runtime.spi.RegistryStrategy.processChangeEvent(RegistryStrategy.java:260)
	at org.eclipse.core.internal.registry.osgi.ExtensionEventDispatcherJob.run(ExtensionEventDispatcherJob.java:50)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.registry 4 0 2018-12-07 09:13:24.867
!MESSAGE Error notifying registry change listener.
!SUBENTRY 1 org.eclipse.equinox.registry 4 0 2018-12-07 09:13:24.867
!MESSAGE Error notifying registry change listener.
!STACK 0
org.eclipse.core.runtime.InvalidRegistryObjectException: Invalid registry object
	at org.eclipse.core.internal.registry.TemporaryObjectManager.getObject(TemporaryObjectManager.java:98)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtension(BaseExtensionHandle.java:30)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtensionPointUniqueIdentifier(BaseExtensionHandle.java:55)
	at org.eclipse.core.internal.registry.RegistryDelta.getExtensionDeltas(RegistryDelta.java:40)
	at org.eclipse.core.internal.registry.RegistryChangeEvent.getExtensionDeltas(RegistryChangeEvent.java:74)
	at org.eclipse.core.internal.preferences.PreferenceServiceRegistryHelper.registryChanged(PreferenceServiceRegistryHelper.java:255)
	at org.eclipse.core.internal.registry.ExtensionRegistry$2.run(ExtensionRegistry.java:922)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.registry.ExtensionRegistry.processChangeEvent(ExtensionRegistry.java:920)
	at org.eclipse.core.runtime.spi.RegistryStrategy.processChangeEvent(RegistryStrategy.java:260)
	at org.eclipse.core.internal.registry.osgi.ExtensionEventDispatcherJob.run(ExtensionEventDispatcherJob.java:50)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
!SUBENTRY 1 org.eclipse.equinox.registry 4 0 2018-12-07 09:13:24.867
!MESSAGE Error notifying registry change listener.
!STACK 0
org.eclipse.core.runtime.InvalidRegistryObjectException: Invalid registry object
	at org.eclipse.core.internal.registry.TemporaryObjectManager.getObject(TemporaryObjectManager.java:98)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtension(BaseExtensionHandle.java:30)
	at org.eclipse.core.internal.registry.BaseExtensionHandle.getExtensionPointUniqueIdentifier(BaseExtensionHandle.java:55)
	at org.eclipse.core.internal.registry.RegistryDelta.getExtensionDeltas(RegistryDelta.java:40)
	at org.eclipse.core.internal.registry.RegistryChangeEvent.getExtensionDeltas(RegistryChangeEvent.java:74)
	at org.eclipse.core.internal.content.ContentTypeManager$ContentTypeRegistryChangeListener.registryChanged(ContentTypeManager.java:25)
	at org.eclipse.core.internal.registry.ExtensionRegistry$2.run(ExtensionRegistry.java:922)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.registry.ExtensionRegistry.processChangeEvent(ExtensionRegistry.java:920)
	at org.eclipse.core.runtime.spi.RegistryStrategy.processChangeEvent(RegistryStrategy.java:260)
	at org.eclipse.core.internal.registry.osgi.ExtensionEventDispatcherJob.run(ExtensionEventDispatcherJob.java:50)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY com.jaspersoft.studio 1 0 2018-12-07 09:13:38.785
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY org.eclipse.egit.ui 2 0 2018-12-07 09:14:07.326
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY com.jaspersoft.studio 4 0 2018-12-07 09:14:11.764
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-07 09:14:28.113
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.jdt.core 4 2 2018-12-07 09:14:44.618
!MESSAGE Problems occurred when invoking code from plug-in: "org.eclipse.jdt.core".
!STACK 0
org.eclipse.swt.SWTException: Invalid thread access
	at org.eclipse.swt.SWT.error(SWT.java:4533)
	at org.eclipse.swt.SWT.error(SWT.java:4448)
	at org.eclipse.swt.SWT.error(SWT.java:4419)
	at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
	at org.eclipse.swt.widgets.Widget.checkWidget(Widget.java:373)
	at org.eclipse.swt.widgets.Control.getParent(Control.java:1534)
	at com.jaspersoft.studio.property.section.widgets.SPClassType.getControl(SPClassType.java:72)
	at com.jaspersoft.studio.property.section.widgets.ASPropertyWidget.getControlToBorder(ASPropertyWidget.java:318)
	at com.jaspersoft.studio.property.section.widgets.ASPropertyWidget.resetErrors(ASPropertyWidget.java:427)
	at com.jaspersoft.studio.property.section.AbstractSection.resetErrors(AbstractSection.java:120)
	at com.jaspersoft.studio.properties.view.TabbedPropertySheetPage.resetErrors(TabbedPropertySheetPage.java:329)
	at com.jaspersoft.studio.properties.view.TabbedPropertySheetPage.showErrors(TabbedPropertySheetPage.java:283)
	at com.jaspersoft.studio.property.section.AbstractSection.propertyChange(AbstractSection.java:286)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at com.jaspersoft.studio.model.MReport.propertyChange(MReport.java:742)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at com.jaspersoft.studio.model.MGraphicElement.propertyChange(MGraphicElement.java:940)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:303)
	at com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration$ClasspathListener.propertyChange(JasperReportsConfiguration.java:223)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:303)
	at net.sf.jasperreports.eclipse.classpath.JavaProjectClassLoader$2.elementChanged(JavaProjectClassLoader.java:160)
	at org.eclipse.jdt.internal.core.DeltaProcessor$3.run(DeltaProcessor.java:1662)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.jdt.internal.core.DeltaProcessor.notifyListeners(DeltaProcessor.java:1652)
	at org.eclipse.jdt.internal.core.DeltaProcessor.firePostChangeDelta(DeltaProcessor.java:1486)
	at org.eclipse.jdt.internal.core.DeltaProcessor.fire(DeltaProcessor.java:1462)
	at org.eclipse.jdt.internal.core.DeltaProcessor.resourceChanged(DeltaProcessor.java:2074)
	at org.eclipse.jdt.internal.core.DeltaProcessingState.resourceChanged(DeltaProcessingState.java:477)
	at org.eclipse.core.internal.events.NotificationManager$1.run(NotificationManager.java:299)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.events.NotificationManager.notify(NotificationManager.java:289)
	at org.eclipse.core.internal.events.NotificationManager.broadcastChanges(NotificationManager.java:152)
	at org.eclipse.core.internal.resources.Workspace.broadcastPostChange(Workspace.java:374)
	at org.eclipse.core.internal.resources.Workspace.endOperation(Workspace.java:1469)
	at org.eclipse.core.internal.resources.Workspace.run(Workspace.java:2253)
	at org.eclipse.core.internal.resources.Workspace.run(Workspace.java:2267)
	at org.eclipse.jdt.internal.core.JavaModelOperation.runOperation(JavaModelOperation.java:795)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3097)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3059)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3112)
	at com.jaspersoft.studio.server.container.JRSClasspathContainerFactory.createJRClasspathContainer(JRSClasspathContainerFactory.java:28)
	at net.sf.jasperreports.eclipse.classpath.container.ClasspathContainerManager.createJRClasspathContainer(ClasspathContainerManager.java:44)
	at net.sf.jasperreports.eclipse.wizard.project.ProjectUtil.createJRClasspathContainer(ProjectUtil.java:113)
	at net.sf.jasperreports.eclipse.wizard.project.ProjectUtil.createJRProject(ProjectUtil.java:83)
	at com.jaspersoft.studio.rcp.Startup.earlyStartup(Startup.java:82)
	at org.eclipse.ui.internal.EarlyStartupRunnable.runEarlyStartup(EarlyStartupRunnable.java:77)
	at org.eclipse.ui.internal.EarlyStartupRunnable.run(EarlyStartupRunnable.java:53)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.Workbench$55.run(Workbench.java:2835)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.jdt.core 4 4 2018-12-07 09:14:44.650
!MESSAGE Exception occurred in listener of Java element change notification
!STACK 0
org.eclipse.swt.SWTException: Invalid thread access
	at org.eclipse.swt.SWT.error(SWT.java:4533)
	at org.eclipse.swt.SWT.error(SWT.java:4448)
	at org.eclipse.swt.SWT.error(SWT.java:4419)
	at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
	at org.eclipse.swt.widgets.Widget.checkWidget(Widget.java:373)
	at org.eclipse.swt.widgets.Control.getParent(Control.java:1534)
	at com.jaspersoft.studio.property.section.widgets.SPClassType.getControl(SPClassType.java:72)
	at com.jaspersoft.studio.property.section.widgets.ASPropertyWidget.getControlToBorder(ASPropertyWidget.java:318)
	at com.jaspersoft.studio.property.section.widgets.ASPropertyWidget.resetErrors(ASPropertyWidget.java:427)
	at com.jaspersoft.studio.property.section.AbstractSection.resetErrors(AbstractSection.java:120)
	at com.jaspersoft.studio.properties.view.TabbedPropertySheetPage.resetErrors(TabbedPropertySheetPage.java:329)
	at com.jaspersoft.studio.properties.view.TabbedPropertySheetPage.showErrors(TabbedPropertySheetPage.java:283)
	at com.jaspersoft.studio.property.section.AbstractSection.propertyChange(AbstractSection.java:286)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at com.jaspersoft.studio.model.MReport.propertyChange(MReport.java:742)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at com.jaspersoft.studio.model.ANode.firePropertyChange(ANode.java:410)
	at com.jaspersoft.studio.model.ANode.propertyChange(ANode.java:406)
	at com.jaspersoft.studio.model.MGraphicElement.propertyChange(MGraphicElement.java:940)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:303)
	at com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration$ClasspathListener.propertyChange(JasperReportsConfiguration.java:223)
	at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
	at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:303)
	at net.sf.jasperreports.eclipse.classpath.JavaProjectClassLoader$2.elementChanged(JavaProjectClassLoader.java:160)
	at org.eclipse.jdt.internal.core.DeltaProcessor$3.run(DeltaProcessor.java:1662)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.jdt.internal.core.DeltaProcessor.notifyListeners(DeltaProcessor.java:1652)
	at org.eclipse.jdt.internal.core.DeltaProcessor.firePostChangeDelta(DeltaProcessor.java:1486)
	at org.eclipse.jdt.internal.core.DeltaProcessor.fire(DeltaProcessor.java:1462)
	at org.eclipse.jdt.internal.core.DeltaProcessor.resourceChanged(DeltaProcessor.java:2074)
	at org.eclipse.jdt.internal.core.DeltaProcessingState.resourceChanged(DeltaProcessingState.java:477)
	at org.eclipse.core.internal.events.NotificationManager$1.run(NotificationManager.java:299)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.core.internal.events.NotificationManager.notify(NotificationManager.java:289)
	at org.eclipse.core.internal.events.NotificationManager.broadcastChanges(NotificationManager.java:152)
	at org.eclipse.core.internal.resources.Workspace.broadcastPostChange(Workspace.java:374)
	at org.eclipse.core.internal.resources.Workspace.endOperation(Workspace.java:1469)
	at org.eclipse.core.internal.resources.Workspace.run(Workspace.java:2253)
	at org.eclipse.core.internal.resources.Workspace.run(Workspace.java:2267)
	at org.eclipse.jdt.internal.core.JavaModelOperation.runOperation(JavaModelOperation.java:795)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3097)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3059)
	at org.eclipse.jdt.internal.core.JavaProject.setRawClasspath(JavaProject.java:3112)
	at com.jaspersoft.studio.server.container.JRSClasspathContainerFactory.createJRClasspathContainer(JRSClasspathContainerFactory.java:28)
	at net.sf.jasperreports.eclipse.classpath.container.ClasspathContainerManager.createJRClasspathContainer(ClasspathContainerManager.java:44)
	at net.sf.jasperreports.eclipse.wizard.project.ProjectUtil.createJRClasspathContainer(ProjectUtil.java:113)
	at net.sf.jasperreports.eclipse.wizard.project.ProjectUtil.createJRProject(ProjectUtil.java:83)
	at com.jaspersoft.studio.rcp.Startup.earlyStartup(Startup.java:82)
	at org.eclipse.ui.internal.EarlyStartupRunnable.runEarlyStartup(EarlyStartupRunnable.java:77)
	at org.eclipse.ui.internal.EarlyStartupRunnable.run(EarlyStartupRunnable.java:53)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.Workbench$55.run(Workbench.java:2835)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-07 09:15:31.431
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-07 09:18:23.417
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-07 09:18:25.857
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-10 10:50:41.872 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 10:50:46.936
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY com.jaspersoft.studio 1 0 2018-12-10 10:50:54.497
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY org.eclipse.egit.ui 2 0 2018-12-10 10:51:15.289
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 10:51:21.462
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-10 10:51:37.708
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-10 10:52:41.041
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.jface 2 0 2018-12-10 11:05:00.545
!MESSAGE Keybinding conflicts occurred.  They may interfere with normal accelerator operation.
!SUBENTRY 1 org.eclipse.jface 2 0 2018-12-10 11:05:00.546
!MESSAGE A conflict occurred for F2:
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.rename,Rename,
		Rename the selected item,
		Category(org.eclipse.ui.category.file,File,null,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@544300a6,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.ui.contexts.window,,,system)
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.text.showInformation,Show Tooltip Description,
		Displays information for the current caret location in a focused hover,
		Category(org.eclipse.ui.category.textEditor,Text Editing,Text Editing Commands,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@339e1787,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.xtext.ui.embeddedTextEditorScope,,,system)

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 11:05:28.449
!MESSAGE Error while performing the new object creation.
!STACK 0
com.jaspersoft.studio.model.command.CancelledOperationException: cancelled
	at com.jaspersoft.studio.model.command.Tag.createVariable(Tag.java:184)
	at com.jaspersoft.studio.model.command.CreateE4ObjectCommand.createObject(CreateE4ObjectCommand.java:123)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at com.jaspersoft.studio.model.command.CreateE4ObjectCommand.execute(CreateE4ObjectCommand.java:164)
	at com.jaspersoft.studio.model.command.CreateFieldInEditorCommand.execute(CreateFieldInEditorCommand.java:177)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$1.execute(JSSTemplateTransferDropTargetListener.java:572)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener.executeCompoundCommand(JSSTemplateTransferDropTargetListener.java:585)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener.access$0(JSSTemplateTransferDropTargetListener.java:560)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:144)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 11:06:13.837
!MESSAGE Error while performing the new object creation.
!STACK 0
com.jaspersoft.studio.model.command.CancelledOperationException: cancelled
	at com.jaspersoft.studio.model.command.Tag.createVariable(Tag.java:184)
	at com.jaspersoft.studio.model.command.CreateE4ObjectCommand.createObject(CreateE4ObjectCommand.java:114)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at com.jaspersoft.studio.model.command.CreateE4ObjectCommand.execute(CreateE4ObjectCommand.java:164)
	at com.jaspersoft.studio.model.command.CreateFieldInEditorCommand.execute(CreateFieldInEditorCommand.java:177)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$1.execute(JSSTemplateTransferDropTargetListener.java:572)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener.executeCompoundCommand(JSSTemplateTransferDropTargetListener.java:585)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener.access$0(JSSTemplateTransferDropTargetListener.java:560)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:144)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)

!ENTRY org.eclipse.ui 4 0 2018-12-10 11:28:32.841
!MESSAGE Unhandled event loop exception
!STACK 0
java.lang.NullPointerException
	at com.jaspersoft.studio.server.selector.FileSelector$3.widgetSelected(FileSelector.java:109)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:249)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4418)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1079)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:4236)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3824)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:818)
	at org.eclipse.jface.window.Window.open(Window.java:794)
	at com.jaspersoft.studio.jface.dialogs.FileSelectionDialog.open(FileSelectionDialog.java:463)
	at com.jaspersoft.studio.model.subreport.command.wizard.NewSubreportPage$5.widgetSelected(NewSubreportPage.java:207)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:249)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4418)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1079)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:4236)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3824)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:818)
	at org.eclipse.jface.window.Window.open(Window.java:794)
	at com.jaspersoft.studio.model.subreport.command.CreateSubreportCommand.createObject(CreateSubreportCommand.java:92)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:146)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)

!ENTRY org.eclipse.text 4 2 2018-12-10 11:30:19.364
!MESSAGE Problems occurred when invoking code from plug-in: "org.eclipse.text".
!STACK 0
org.eclipse.swt.SWTException: Invalid thread access
	at org.eclipse.swt.SWT.error(SWT.java:4533)
	at org.eclipse.swt.SWT.error(SWT.java:4448)
	at org.eclipse.swt.SWT.error(SWT.java:4419)
	at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
	at org.eclipse.swt.widgets.Widget.checkWidget(Widget.java:373)
	at org.eclipse.swt.custom.StyledText.getLinePixel(StyledText.java:4254)
	at org.eclipse.swt.custom.StyledText.handleTextChanging(StyledText.java:6361)
	at org.eclipse.swt.custom.StyledText$6.textChanging(StyledText.java:5707)
	at org.eclipse.jface.text.DefaultDocumentAdapter.fireTextChanging(DefaultDocumentAdapter.java:367)
	at org.eclipse.jface.text.DefaultDocumentAdapter.documentAboutToBeChanged(DefaultDocumentAdapter.java:284)
	at org.eclipse.jface.text.AbstractDocument.fireDocumentAboutToBeChanged(AbstractDocument.java:632)
	at org.eclipse.jface.text.AbstractDocument.set(AbstractDocument.java:1132)
	at org.eclipse.jface.text.AbstractDocument.set(AbstractDocument.java:1124)
	at com.jaspersoft.studio.editor.AbstractJRXMLEditor.model2xml(AbstractJRXMLEditor.java:1017)
	at com.jaspersoft.studio.editor.AbstractJRXMLEditor.doSave(AbstractJRXMLEditor.java:654)
	at com.jaspersoft.studio.editor.action.CompileAction$1.run(CompileAction.java:96)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.text 4 2 2018-12-10 11:30:19.370
!MESSAGE Problems occurred when invoking code from plug-in: "org.eclipse.text".
!STACK 0
org.eclipse.swt.SWTException: Invalid thread access
	at org.eclipse.swt.SWT.error(SWT.java:4533)
	at org.eclipse.swt.SWT.error(SWT.java:4448)
	at org.eclipse.swt.SWT.error(SWT.java:4419)
	at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
	at org.eclipse.swt.widgets.Widget.checkWidget(Widget.java:373)
	at org.eclipse.swt.widgets.Scrollable.getVerticalBar(Scrollable.java:280)
	at org.eclipse.swt.custom.StyledText.reset(StyledText.java:7991)
	at org.eclipse.swt.custom.StyledText.handleTextSet(StyledText.java:6390)
	at org.eclipse.swt.custom.StyledText$6.textSet(StyledText.java:5715)
	at org.eclipse.jface.text.DefaultDocumentAdapter.fireTextSet(DefaultDocumentAdapter.java:339)
	at org.eclipse.jface.text.DefaultDocumentAdapter.documentChanged(DefaultDocumentAdapter.java:264)
	at org.eclipse.jface.text.AbstractDocument.doFireDocumentChanged2(AbstractDocument.java:735)
	at org.eclipse.jface.text.AbstractDocument.doFireDocumentChanged(AbstractDocument.java:712)
	at org.eclipse.jface.text.AbstractDocument.doFireDocumentChanged(AbstractDocument.java:696)
	at org.eclipse.jface.text.AbstractDocument.fireDocumentChanged(AbstractDocument.java:770)
	at org.eclipse.jface.text.AbstractDocument.set(AbstractDocument.java:1141)
	at org.eclipse.jface.text.AbstractDocument.set(AbstractDocument.java:1124)
	at com.jaspersoft.studio.editor.AbstractJRXMLEditor.model2xml(AbstractJRXMLEditor.java:1017)
	at com.jaspersoft.studio.editor.AbstractJRXMLEditor.doSave(AbstractJRXMLEditor.java:654)
	at com.jaspersoft.studio.editor.action.CompileAction$1.run(CompileAction.java:96)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 11:33:49.795
!MESSAGE An error occurred
!STACK 0
org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.parsers.DOMParser.parse(Unknown Source)
	at org.apache.xerces.jaxp.DocumentBuilderImpl.parse(Unknown Source)
	at javax.xml.parsers.DocumentBuilder.parse(DocumentBuilder.java:121)
	at com.jaspersoft.studio.utils.XMLUtils.parseNoValidation(XMLUtils.java:27)
	at com.jaspersoft.studio.JrxmlContentDescriber.validateStandardJRXML(JrxmlContentDescriber.java:121)
	at com.jaspersoft.studio.JrxmlContentDescriber.isStandardJRXML(JrxmlContentDescriber.java:68)
	at com.jaspersoft.studio.model.subreport.command.wizard.NewSubreportPage$5.widgetSelected(NewSubreportPage.java:235)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:249)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4418)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1079)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:4236)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3824)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:818)
	at org.eclipse.jface.window.Window.open(Window.java:794)
	at com.jaspersoft.studio.model.subreport.command.CreateSubreportCommand.createObject(CreateSubreportCommand.java:92)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:146)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)
Caused by: org.apache.xerces.impl.io.MalformedByteSequenceException: Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.impl.io.UTF8Reader.invalidByte(Unknown Source)
	at org.apache.xerces.impl.io.UTF8Reader.read(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.load(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.skipString(Unknown Source)
	at org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
	... 44 more

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 11:39:30.270
!MESSAGE An error occurred
!STACK 0
org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.parsers.DOMParser.parse(Unknown Source)
	at org.apache.xerces.jaxp.DocumentBuilderImpl.parse(Unknown Source)
	at javax.xml.parsers.DocumentBuilder.parse(DocumentBuilder.java:121)
	at com.jaspersoft.studio.utils.XMLUtils.parseNoValidation(XMLUtils.java:27)
	at com.jaspersoft.studio.JrxmlContentDescriber.validateStandardJRXML(JrxmlContentDescriber.java:121)
	at com.jaspersoft.studio.JrxmlContentDescriber.isStandardJRXML(JrxmlContentDescriber.java:68)
	at com.jaspersoft.studio.model.subreport.command.wizard.NewSubreportPage$5.widgetSelected(NewSubreportPage.java:235)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:249)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4418)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1079)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:4236)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3824)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:818)
	at org.eclipse.jface.window.Window.open(Window.java:794)
	at com.jaspersoft.studio.model.subreport.command.CreateSubreportCommand.createObject(CreateSubreportCommand.java:92)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:146)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)
Caused by: org.apache.xerces.impl.io.MalformedByteSequenceException: Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.impl.io.UTF8Reader.invalidByte(Unknown Source)
	at org.apache.xerces.impl.io.UTF8Reader.read(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.load(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.skipString(Unknown Source)
	at org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
	... 44 more

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 14:28:52.289
!MESSAGE An error occurred
!STACK 0
org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.parsers.DOMParser.parse(Unknown Source)
	at org.apache.xerces.jaxp.DocumentBuilderImpl.parse(Unknown Source)
	at javax.xml.parsers.DocumentBuilder.parse(DocumentBuilder.java:121)
	at com.jaspersoft.studio.utils.XMLUtils.parseNoValidation(XMLUtils.java:27)
	at com.jaspersoft.studio.JrxmlContentDescriber.validateStandardJRXML(JrxmlContentDescriber.java:121)
	at com.jaspersoft.studio.JrxmlContentDescriber.isStandardJRXML(JrxmlContentDescriber.java:68)
	at com.jaspersoft.studio.model.subreport.command.wizard.NewSubreportPage$5.widgetSelected(NewSubreportPage.java:235)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:249)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4418)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1079)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:4236)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3824)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:818)
	at org.eclipse.jface.window.Window.open(Window.java:794)
	at com.jaspersoft.studio.model.subreport.command.CreateSubreportCommand.createObject(CreateSubreportCommand.java:92)
	at com.jaspersoft.studio.model.command.CreateElementCommand.execute(CreateElementCommand.java:373)
	at org.eclipse.gef.commands.CommandStack.execute(CommandStack.java:228)
	at com.jaspersoft.studio.editor.dnd.JSSTemplateTransferDropTargetListener$CommandRunnable.run(JSSTemplateTransferDropTargetListener.java:146)
	at org.eclipse.swt.widgets.RunnableLock.run(RunnableLock.java:35)
	at org.eclipse.swt.widgets.Synchronizer.runAsyncMessages(Synchronizer.java:182)
	at org.eclipse.swt.widgets.Display.runAsyncMessages(Display.java:4211)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3827)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1121)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)
Caused by: org.apache.xerces.impl.io.MalformedByteSequenceException: Invalid byte 1 of 1-byte UTF-8 sequence.
	at org.apache.xerces.impl.io.UTF8Reader.invalidByte(Unknown Source)
	at org.apache.xerces.impl.io.UTF8Reader.read(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.load(Unknown Source)
	at org.apache.xerces.impl.XMLEntityScanner.skipString(Unknown Source)
	at org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
	at org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
	... 44 more

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 14:53:10.744
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-10 14:53:11.664
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-10 14:53:16.345 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 14:53:23.187
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY com.jaspersoft.studio 1 0 2018-12-10 14:53:27.743
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY org.eclipse.egit.ui 2 0 2018-12-10 14:53:51.158
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 14:53:55.032
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-10 14:54:13.956
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-10 14:55:17.255
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 15:07:14.375
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-10 15:07:14.723
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-10 15:09:17.378 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 15:09:19.027
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY com.jaspersoft.studio 1 0 2018-12-10 15:09:20.573
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY org.eclipse.egit.ui 2 0 2018-12-10 15:09:29.292
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY org.eclipse.e4.ui.workbench 4 0 2018-12-10 15:09:41.358
!MESSAGE 
!STACK 0
org.eclipse.core.runtime.AssertionFailedException: assertion failed: 
	at org.eclipse.core.runtime.Assert.isTrue(Assert.java:110)
	at org.eclipse.core.runtime.Assert.isTrue(Assert.java:96)
	at org.eclipse.ui.part.MultiPageEditorPart.setActivePage(MultiPageEditorPart.java:1100)
	at org.eclipse.ui.part.MultiPageEditorPart.createPartControl(MultiPageEditorPart.java:367)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityPart.createPartControl(CompatibilityPart.java:150)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor.createPartControl(CompatibilityEditor.java:99)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityPart.create(CompatibilityPart.java:340)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.e4.core.internal.di.MethodRequestor.execute(MethodRequestor.java:55)
	at org.eclipse.e4.core.internal.di.InjectorImpl.processAnnotated(InjectorImpl.java:966)
	at org.eclipse.e4.core.internal.di.InjectorImpl.processAnnotated(InjectorImpl.java:931)
	at org.eclipse.e4.core.internal.di.InjectorImpl.inject(InjectorImpl.java:151)
	at org.eclipse.e4.core.internal.di.InjectorImpl.internalMake(InjectorImpl.java:375)
	at org.eclipse.e4.core.internal.di.InjectorImpl.make(InjectorImpl.java:294)
	at org.eclipse.e4.core.contexts.ContextInjectionFactory.make(ContextInjectionFactory.java:162)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.createFromBundle(ReflectionContributionFactory.java:105)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.doCreate(ReflectionContributionFactory.java:74)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.create(ReflectionContributionFactory.java:56)
	at org.eclipse.e4.ui.workbench.renderers.swt.ContributedPartRenderer.createWidget(ContributedPartRenderer.java:129)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createWidget(PartRenderingEngine.java:975)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:651)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:757)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$0(PartRenderingEngine.java:728)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$2.run(PartRenderingEngine.java:722)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:706)
	at org.eclipse.e4.ui.workbench.renderers.swt.StackRenderer.showTab(StackRenderer.java:1324)
	at org.eclipse.e4.ui.workbench.renderers.swt.LazyStackRenderer$1.handleEvent(LazyStackRenderer.java:72)
	at org.eclipse.e4.ui.services.internal.events.UIEventHandler$1.run(UIEventHandler.java:40)
	at org.eclipse.swt.widgets.Synchronizer.syncExec(Synchronizer.java:233)
	at org.eclipse.ui.internal.UISynchronizer.syncExec(UISynchronizer.java:145)
	at org.eclipse.swt.widgets.Display.syncExec(Display.java:4821)
	at org.eclipse.e4.ui.internal.workbench.swt.E4Application$1.syncExec(E4Application.java:211)
	at org.eclipse.e4.ui.services.internal.events.UIEventHandler.handleEvent(UIEventHandler.java:36)
	at org.eclipse.equinox.internal.event.EventHandlerWrapper.handleEvent(EventHandlerWrapper.java:201)
	at org.eclipse.equinox.internal.event.EventHandlerTracker.dispatchEvent(EventHandlerTracker.java:197)
	at org.eclipse.equinox.internal.event.EventHandlerTracker.dispatchEvent(EventHandlerTracker.java:1)
	at org.eclipse.osgi.framework.eventmgr.EventManager.dispatchEvent(EventManager.java:230)
	at org.eclipse.osgi.framework.eventmgr.ListenerQueue.dispatchEventSynchronous(ListenerQueue.java:148)
	at org.eclipse.equinox.internal.event.EventAdminImpl.dispatchEvent(EventAdminImpl.java:135)
	at org.eclipse.equinox.internal.event.EventAdminImpl.sendEvent(EventAdminImpl.java:78)
	at org.eclipse.equinox.internal.event.EventComponent.sendEvent(EventComponent.java:39)
	at org.eclipse.e4.ui.services.internal.events.EventBroker.send(EventBroker.java:94)
	at org.eclipse.e4.ui.internal.workbench.UIEventPublisher.notifyChanged(UIEventPublisher.java:60)
	at org.eclipse.emf.common.notify.impl.BasicNotifierImpl.eNotify(BasicNotifierImpl.java:374)
	at org.eclipse.e4.ui.model.application.ui.impl.ElementContainerImpl.setSelectedElement(ElementContainerImpl.java:173)
	at org.eclipse.e4.ui.internal.workbench.ModelServiceImpl.showElementInWindow(ModelServiceImpl.java:617)
	at org.eclipse.e4.ui.internal.workbench.ModelServiceImpl.bringToTop(ModelServiceImpl.java:581)
	at org.eclipse.e4.ui.internal.workbench.PartServiceImpl.delegateBringToTop(PartServiceImpl.java:770)
	at org.eclipse.e4.ui.internal.workbench.PartServiceImpl.bringToTop(PartServiceImpl.java:401)
	at org.eclipse.e4.ui.internal.workbench.PartServiceImpl.showPart(PartServiceImpl.java:1214)
	at org.eclipse.ui.internal.WorkbenchPage.busyOpenEditor(WorkbenchPage.java:3261)
	at org.eclipse.ui.internal.WorkbenchPage.access$25(WorkbenchPage.java:3176)
	at org.eclipse.ui.internal.WorkbenchPage$10.run(WorkbenchPage.java:3158)
	at org.eclipse.swt.custom.BusyIndicator.showWhile(BusyIndicator.java:70)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3153)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3117)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3098)
	at org.eclipse.ui.ide.IDE.openEditor(IDE.java:600)
	at com.jaspersoft.studio.editor.JasperFileEditorLauncher.open(JasperFileEditorLauncher.java:57)
	at org.eclipse.ui.internal.WorkbenchPage$31.run(WorkbenchPage.java:5384)
	at org.eclipse.swt.custom.BusyIndicator.showWhile(BusyIndicator.java:70)
	at org.eclipse.ui.internal.WorkbenchPage.openExternalEditor(WorkbenchPage.java:5375)
	at org.eclipse.ui.internal.WorkbenchPage.busyOpenEditor(WorkbenchPage.java:3253)
	at org.eclipse.ui.internal.WorkbenchPage.access$25(WorkbenchPage.java:3176)
	at org.eclipse.ui.internal.WorkbenchPage$10.run(WorkbenchPage.java:3158)
	at org.eclipse.swt.custom.BusyIndicator.showWhile(BusyIndicator.java:70)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3153)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3117)
	at org.eclipse.ui.internal.WorkbenchPage.openEditor(WorkbenchPage.java:3098)
	at org.eclipse.ui.ide.IDE.openEditorOnFileStore(IDE.java:1397)
	at com.jaspersoft.studio.rcp.OpenDocumentEventProcessor.openFiles(OpenDocumentEventProcessor.java:66)
	at com.jaspersoft.studio.rcp.intro.ApplicationWorkbenchAdvisor.eventLoopIdle(ApplicationWorkbenchAdvisor.java:372)
	at org.eclipse.ui.internal.Workbench$3.eventLoopIdle(Workbench.java:526)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$4.run(PartRenderingEngine.java:1126)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1022)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:150)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:693)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:336)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:610)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:148)
	at com.jaspersoft.studio.rcp.intro.Application.start(Application.java:91)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:388)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:243)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:673)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:610)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1519)

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 15:09:44.902
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-10 15:09:51.147
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-10 15:10:54.438
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.jface 2 0 2018-12-10 15:20:52.162
!MESSAGE Keybinding conflicts occurred.  They may interfere with normal accelerator operation.
!SUBENTRY 1 org.eclipse.jface 2 0 2018-12-10 15:20:52.162
!MESSAGE A conflict occurred for F2:
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.rename,Rename,
		Rename the selected item,
		Category(org.eclipse.ui.category.file,File,null,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@28d7bd6b,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.ui.contexts.window,,,system)
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.text.showInformation,Show Tooltip Description,
		Displays information for the current caret location in a focused hover,
		Category(org.eclipse.ui.category.textEditor,Text Editing,Text Editing Commands,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@7f49156c,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.xtext.ui.embeddedTextEditorScope,,,system)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 15:23:57.898
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-10 15:23:58.228
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-10 15:24:00.815 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 15:24:02.515
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY com.jaspersoft.studio 1 0 2018-12-10 15:24:04.104
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY org.eclipse.egit.ui 2 0 2018-12-10 15:24:13.641
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY com.jaspersoft.studio 4 0 2018-12-10 15:24:27.190
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-10 15:24:35.390
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-10 15:25:38.700
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-10 16:00:25.842
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-10 16:00:26.182
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-11 08:13:41.423 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-11 08:13:50.210
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY com.jaspersoft.studio 1 0 2018-12-11 08:13:56.983
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY com.jaspersoft.studio 4 0 2018-12-11 08:14:32.519
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.egit.ui 2 0 2018-12-11 08:14:34.048
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-11 08:14:56.630
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-11 08:16:00.116
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.jface 2 0 2018-12-11 08:21:54.727
!MESSAGE Keybinding conflicts occurred.  They may interfere with normal accelerator operation.
!SUBENTRY 1 org.eclipse.jface 2 0 2018-12-11 08:21:54.727
!MESSAGE A conflict occurred for F2:
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.rename,Rename,
		Rename the selected item,
		Category(org.eclipse.ui.category.file,File,null,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@bd09a26,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.ui.contexts.window,,,system)
Binding(F2,
	ParameterizedCommand(Command(org.eclipse.ui.edit.text.showInformation,Show Tooltip Description,
		Displays information for the current caret location in a focused hover,
		Category(org.eclipse.ui.category.textEditor,Text Editing,Text Editing Commands,true),
		org.eclipse.ui.internal.WorkbenchHandlerServiceHandler@b025f2f,
		,,true),null),
	org.eclipse.ui.defaultAcceleratorConfiguration,
	org.eclipse.xtext.ui.embeddedTextEditorScope,,,system)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-11 12:03:26.518
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-11 12:03:27.066
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
!SESSION 2018-12-11 12:09:47.544 -----------------------------------------------
eclipse.buildId=unknown
java.version=1.8.0_144
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=pt_BR
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -data @noDefault

!ENTRY org.eclipse.core.resources 2 10035 2018-12-11 12:09:53.572
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY org.eclipse.osgi 2 0 2018-12-11 12:10:02.984
!MESSAGE While loading class "org.eclipse.egit.ui.internal.ConfigurationChecker$1$1", thread "Thread[Worker-1,5,main]" timed out waiting (5001ms) for thread "Thread[main,6,main]" to finish starting bundle "org.eclipse.egit.ui_4.8.0.201706111038-r [149]". To avoid deadlock, thread "Thread[Worker-1,5,main]" is proceeding but "org.eclipse.egit.ui.internal.ConfigurationChecker$1$1" may not be fully initialized.
!STACK 0
org.osgi.framework.BundleException: Unable to acquire the state change lock for the module: osgi.identity; type="osgi.bundle"; version:Version="4.8.0.201706111038-r"; osgi.identity="org.eclipse.egit.ui"; singleton:="true" [id=149] STARTED [STARTED]
	at org.eclipse.osgi.container.Module.lockStateChange(Module.java:337)
	at org.eclipse.osgi.container.Module.start(Module.java:401)
	at org.eclipse.osgi.framework.util.SecureAction.start(SecureAction.java:470)
	at org.eclipse.osgi.internal.hooks.EclipseLazyStarter.postFindLocalClass(EclipseLazyStarter.java:107)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:529)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:325)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:345)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClassInternal(BundleLoader.java:423)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:372)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:364)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:161)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at org.eclipse.egit.ui.internal.ConfigurationChecker$1.run(ConfigurationChecker.java:45)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.util.concurrent.TimeoutException: Timeout after waiting 5 seconds to acquire the lock.
	at org.eclipse.osgi.container.Module.lockStateChange(Module.java:334)
	... 13 more
Root exception:
java.util.concurrent.TimeoutException: Timeout after waiting 5 seconds to acquire the lock.
	at org.eclipse.osgi.container.Module.lockStateChange(Module.java:334)
	at org.eclipse.osgi.container.Module.start(Module.java:401)
	at org.eclipse.osgi.framework.util.SecureAction.start(SecureAction.java:470)
	at org.eclipse.osgi.internal.hooks.EclipseLazyStarter.postFindLocalClass(EclipseLazyStarter.java:107)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:529)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:325)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:345)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClassInternal(BundleLoader.java:423)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:372)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:364)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:161)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at org.eclipse.egit.ui.internal.ConfigurationChecker$1.run(ConfigurationChecker.java:45)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY com.jaspersoft.studio 1 0 2018-12-11 12:10:04.678
!MESSAGE Starting JaspersoftStudio bundle - Version: 6.5.1.final

!ENTRY com.jaspersoft.studio 4 0 2018-12-11 12:10:40.420
!MESSAGE Error while checking for updates
!STACK 0
org.apache.http.conn.HttpHostConnectException: Connect to jasperstudio.sf.net:80 [jasperstudio.sf.net/216.105.38.10] failed: Connection timed out: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.apache.http.client.fluent.Executor.execute(Executor.java:206)
	at com.jaspersoft.studio.statistics.UsageManager.checkVersion(UsageManager.java:772)
	at com.jaspersoft.studio.statistics.heartbeat.Heartbeat.run(Heartbeat.java:23)
	at com.jaspersoft.studio.statistics.UsageManager$3.run(UsageManager.java:617)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 14 more

!ENTRY org.eclipse.egit.ui 2 0 2018-12-11 12:10:55.237
!MESSAGE Warning: The environment variable HOME is not set. The following directory will be used to store the Git
user global configuration and to define the default location to store repositories: 'C:\Users\s60254831168'. If this is
not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and
EGit might behave differently since they see different configuration options.
This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.

!ENTRY org.eclipse.equinox.p2.transport.ecf 2 0 2018-12-11 12:11:17.409
!MESSAGE Connection to http://jasperstudio.sf.net/jssproductrepo_E4_CE/p2.index failed on Connection timed out: connect. Retry attempt 0 started
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.eclipse.ecf.internal.provider.filetransfer.httpclient4.ECFHttpClientProtocolSocketFactory.connectSocket(ECFHttpClientProtocolSocketFactory.java:86)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.AbstractPoolEntry.open(AbstractPoolEntry.java:144)
	at org.apache.http.impl.conn.AbstractPooledConnAdapter.open(AbstractPooledConnAdapter.java:131)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.performConnect(HttpClientRetrieveFileTransfer.java:1084)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer.access$0(HttpClientRetrieveFileTransfer.java:1075)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientRetrieveFileTransfer$1.performFileTransfer(HttpClientRetrieveFileTransfer.java:1071)
	at org.eclipse.ecf.filetransfer.FileTransferJob.run(FileTransferJob.java:74)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.equinox.p2.transport.ecf 4 1002 2018-12-11 12:12:20.718
!MESSAGE Unable to connect to repository http://jasperstudio.sf.net/jssproductrepo_E4_CE/content.xml
!STACK 0
java.net.ConnectException: Connection timed out: connect
	at java.net.TwoStacksPlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:117)
	at org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:177)
	at org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:304)
	at org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:611)
	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:446)
	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:863)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:82)
	at org.eclipse.ecf.provider.filetransfer.httpclient4.HttpClientFileSystemBrowser.runRequest(HttpClientFileSystemBrowser.java:263)
	at org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser$DirectoryJob.run(AbstractFileSystemBrowser.java:69)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)

!ENTRY org.eclipse.core.resources 2 10035 2018-12-11 12:47:38.078
!MESSAGE The workspace will exit with unsaved changes in this session.

!ENTRY org.eclipse.core.jobs 2 2 2018-12-11 12:47:38.428
!MESSAGE Job found still running after platform shutdown.  Jobs should be canceled by the plugin that scheduled them during shutdown: com.jaspersoft.studio.statistics.UsageManager$2
