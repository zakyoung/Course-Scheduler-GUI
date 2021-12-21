<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jTabbedPane1" max="32767" attributes="0"/>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jLabel1" max="32767" attributes="0"/>
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="10" pref="10" max="-2" attributes="0"/>
                              <Component id="jLabel2" min="-2" max="-2" attributes="0"/>
                              <EmptySpace max="-2" attributes="0"/>
                              <Component id="currentSemesterLabel" min="-2" pref="195" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                              <Component id="currentSemesterComboBox" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="30" max="-2" attributes="0"/>
                              <Component id="changeSemesterButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="80" max="-2" attributes="0"/>
                          </Group>
                      </Group>
                  </Group>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="currentSemesterLabel" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="currentSemesterComboBox" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="changeSemesterButton" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="jTabbedPane1" min="-2" pref="450" max="-2" attributes="0"/>
              <EmptySpace pref="15" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="99" green="0" red="0" type="rgb"/>
        </Property>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Comic Sans MS" size="30" style="1"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="33" red="33" type="rgb"/>
        </Property>
        <Property name="horizontalAlignment" type="int" value="0"/>
        <Property name="text" type="java.lang.String" value="Course Scheduler"/>
      </Properties>
    </Component>
    <Container class="javax.swing.JTabbedPane" name="jTabbedPane1">
      <Properties>
        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="33" red="33" type="rgb"/>
        </Property>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="ff" red="ff" type="rgb"/>
        </Property>
        <Property name="toolTipText" type="java.lang.String" value=""/>
      </Properties>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout"/>
      <SubComponents>
        <Container class="javax.swing.JPanel" name="jPanel1">
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Admin">
                <Property name="tabTitle" type="java.lang.String" value="Admin"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jTabbedPane2" alignment="0" max="32767" attributes="0"/>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <Component id="jTabbedPane2" min="-2" pref="413" max="-2" attributes="0"/>
                      <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Container class="javax.swing.JTabbedPane" name="jTabbedPane2">
              <Properties>
                <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="33" red="33" type="rgb"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
              </Properties>

              <Layout class="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout"/>
              <SubComponents>
                <Container class="javax.swing.JPanel" name="jPanel3">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Add Semester">
                        <Property name="tabTitle" type="java.lang.String" value="Add Semester"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace min="-2" pref="87" max="-2" attributes="0"/>
                                      <Component id="addSemesterSubmitButton" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" attributes="0">
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="jLabel3" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                      <Component id="addSemesterTextfield" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace min="-2" pref="26" max="-2" attributes="0"/>
                                      <Component id="addSemesterStatusLabel" min="-2" pref="557" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel3" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="addSemesterTextfield" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Component id="addSemesterSubmitButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace type="unrelated" max="-2" attributes="0"/>
                              <Component id="addSemesterStatusLabel" min="-2" pref="71" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel3">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Semester Name:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="addSemesterTextfield">
                      <Properties>
                        <Property name="columns" type="int" value="20"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JButton" name="addSemesterSubmitButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Submit"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="addSemesterSubmitButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="addSemesterStatusLabel">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Times New Roman" size="14" style="1"/>
                        </Property>
                      </Properties>
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel4">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Add Course">
                        <Property name="tabTitle" type="java.lang.String" value="Add Course"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <EmptySpace min="-2" pref="37" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <Component id="jLabel4" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace type="separate" max="-2" attributes="0"/>
                                      <Component id="SetCourseCode" min="-2" pref="200" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <Component id="jLabel5" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                                      <Component id="SetCourseDescription" min="-2" pref="300" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="103" alignment="0" groupAlignment="1" attributes="0">
                                      <Component id="AddCourseSubmitButton" min="-2" pref="75" max="-2" attributes="0"/>
                                      <Group type="102" attributes="0">
                                          <Component id="jLabel6" min="-2" max="-2" attributes="0"/>
                                          <EmptySpace max="-2" attributes="0"/>
                                          <Component id="SetNumberOfSeats" min="-2" pref="75" max="-2" attributes="0"/>
                                      </Group>
                                  </Group>
                                  <Component id="AddCourseDisplay" alignment="0" min="-2" pref="340" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="32" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel4" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetCourseCode" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel5" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetCourseDescription" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Component id="jLabel6" alignment="0" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetNumberOfSeats" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Component id="AddCourseSubmitButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Component id="AddCourseDisplay" min="-2" pref="119" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel4">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Course Code: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel5">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Course Description:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel6">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Number of Seats: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="SetCourseCode">
                    </Component>
                    <Component class="javax.swing.JTextField" name="SetCourseDescription">
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="SetCourseDescriptionActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JSpinner" name="SetNumberOfSeats">
                    </Component>
                    <Component class="javax.swing.JButton" name="AddCourseSubmitButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Submit"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="AddCourseSubmitButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="AddCourseDisplay">
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel5">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Add Student">
                        <Property name="tabTitle" type="java.lang.String" value="Add Student"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <Group type="103" groupAlignment="1" attributes="0">
                                  <Component id="AddStudentDisplay" alignment="1" min="-2" pref="305" max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="0" attributes="0">
                                      <Group type="102" attributes="0">
                                          <EmptySpace min="-2" pref="58" max="-2" attributes="0"/>
                                          <Group type="103" groupAlignment="0" attributes="0">
                                              <Component id="jLabel7" alignment="0" min="-2" max="-2" attributes="0"/>
                                              <Component id="jLabel8" alignment="0" min="-2" max="-2" attributes="0"/>
                                              <Component id="jLabel9" alignment="0" min="-2" max="-2" attributes="0"/>
                                          </Group>
                                          <EmptySpace min="-2" pref="29" max="-2" attributes="0"/>
                                          <Group type="103" groupAlignment="0" max="-2" attributes="0">
                                              <Component id="SetStudentId" alignment="0" max="32767" attributes="0"/>
                                              <Component id="SetFirstName" alignment="0" max="32767" attributes="0"/>
                                              <Component id="SetLastName" alignment="0" pref="200" max="32767" attributes="0"/>
                                          </Group>
                                      </Group>
                                      <Group type="102" alignment="0" attributes="0">
                                          <EmptySpace min="-2" pref="210" max="-2" attributes="0"/>
                                          <Component id="SubmitButton" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                  </Group>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="39" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel7" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetStudentId" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="-2" pref="17" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel8" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetFirstName" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="-2" pref="16" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel9" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SetLastName" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="-2" pref="26" max="-2" attributes="0"/>
                              <Component id="SubmitButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="31" max="-2" attributes="0"/>
                              <Component id="AddStudentDisplay" min="-2" pref="95" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel7">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Student ID: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel8">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="First Name: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel9">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Last Name: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="SetStudentId">
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="SetStudentIdActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JTextField" name="SetFirstName">
                    </Component>
                    <Component class="javax.swing.JTextField" name="SetLastName">
                    </Component>
                    <Component class="javax.swing.JButton" name="SubmitButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Submit"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="SubmitButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="AddStudentDisplay">
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel10">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Display Course List of Students ">
                        <Property name="tabTitle" type="java.lang.String" value="Display Course List of Students "/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jScrollPane3" alignment="0" max="32767" attributes="0"/>
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="21" max="-2" attributes="0"/>
                              <Component id="jLabel17" min="-2" max="-2" attributes="0"/>
                              <EmptySpace max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <EmptySpace min="6" pref="6" max="-2" attributes="0"/>
                                      <Component id="DisplayCourseListOfStudentsButton" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Component id="SelectCourseComboBox4" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="26" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel17" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectCourseComboBox4" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace max="-2" attributes="0"/>
                              <Component id="DisplayCourseListOfStudentsButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                              <Component id="jScrollPane3" min="-2" pref="253" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane3">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTable" name="DisplayCourseListOfStudentsTable">
                          <Properties>
                            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                              <Table columnCount="2" rowCount="4">
                                <Column editable="true" title="Student" type="java.lang.Object"/>
                                <Column editable="true" title="status" type="java.lang.Object"/>
                              </Table>
                            </Property>
                            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
                              <TableColumnModel selectionModel="0">
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                              </TableColumnModel>
                            </Property>
                            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
                              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
                            </Property>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                    <Component class="javax.swing.JLabel" name="jLabel17">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Course:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectCourseComboBox4">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JButton" name="DisplayCourseListOfStudentsButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Display"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DisplayCourseListOfStudentsButtonActionPerformed"/>
                      </Events>
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel11">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Drop Student">
                        <Property name="tabTitle" type="java.lang.String" value="Drop Student"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" alignment="0" attributes="0">
                                      <Component id="jScrollPane4" min="-2" pref="500" max="-2" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="jLabel19" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace min="-2" pref="37" max="-2" attributes="0"/>
                                      <Component id="jLabel15" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="DropStudentAdminButton" min="-2" max="-2" attributes="0"/>
                                          <Component id="SelectStudentComboBox4" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                  </Group>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="52" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel15" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectStudentComboBox4" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="unrelated" max="-2" attributes="0"/>
                              <Component id="DropStudentAdminButton" min="-2" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <EmptySpace min="-2" pref="67" max="-2" attributes="0"/>
                                      <Component id="jLabel19" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace max="32767" attributes="0"/>
                                  </Group>
                                  <Group type="102" attributes="0">
                                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                      <Component id="jScrollPane4" pref="229" max="32767" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel15">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Student: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectStudentComboBox4">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JButton" name="DropStudentAdminButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Drop Student"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DropStudentAdminButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel19">
                    </Component>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane4">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTextArea" name="DropStudentTextArea">
                          <Properties>
                            <Property name="columns" type="int" value="20"/>
                            <Property name="rows" type="int" value="5"/>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel12">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Drop Course ">
                        <Property name="tabTitle" type="java.lang.String" value="Drop Course "/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace min="-2" pref="34" max="-2" attributes="0"/>
                                      <Component id="jLabel16" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="DropCourseButton" min="-2" max="-2" attributes="0"/>
                                          <Component id="SelectCourseComboBox3" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <Component id="jScrollPane6" min="-2" pref="543" max="-2" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="DropCourseJlabel" min="-2" pref="378" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="49" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel16" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectCourseComboBox3" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace max="-2" attributes="0"/>
                              <Component id="DropCourseButton" min="-2" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <EmptySpace max="32767" attributes="0"/>
                                      <Component id="DropCourseJlabel" min="-2" pref="93" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="58" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="jScrollPane6" min="-2" pref="249" max="-2" attributes="0"/>
                                      <EmptySpace max="32767" attributes="0"/>
                                  </Group>
                              </Group>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel16">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Course: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectCourseComboBox3">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JButton" name="DropCourseButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Drop Course"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DropCourseButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="DropCourseJlabel">
                    </Component>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane6">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTextArea" name="DropCourseAdminButton">
                          <Properties>
                            <Property name="columns" type="int" value="20"/>
                            <Property name="rows" type="int" value="5"/>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                  </SubComponents>
                </Container>
              </SubComponents>
            </Container>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JPanel" name="jPanel2">
          <Properties>
            <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
              <Color blue="cc" green="cc" red="cc" type="rgb"/>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
              <JTabbedPaneConstraints tabName="Student">
                <Property name="tabTitle" type="java.lang.String" value="Student"/>
              </JTabbedPaneConstraints>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jTabbedPane3" alignment="1" max="32767" attributes="0"/>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jTabbedPane3" max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Container class="javax.swing.JTabbedPane" name="jTabbedPane3">
              <Properties>
                <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="33" red="33" type="rgb"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
              </Properties>

              <Layout class="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout"/>
              <SubComponents>
                <Container class="javax.swing.JPanel" name="jPanel6">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Display Courses">
                        <Property name="tabTitle" type="java.lang.String" value="Display Courses"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace max="-2" attributes="0"/>
                              <Component id="jScrollPane1" pref="733" max="32767" attributes="0"/>
                          </Group>
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="305" max="-2" attributes="0"/>
                              <Component id="DisplayCoursesButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <Component id="jScrollPane1" min="-2" pref="250" max="-2" attributes="0"/>
                              <EmptySpace pref="40" max="32767" attributes="0"/>
                              <Component id="DisplayCoursesButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="37" max="-2" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTable" name="DisplayCoursesTable">
                          <Properties>
                            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                              <Table columnCount="3" rowCount="4">
                                <Column editable="true" title="Course Code" type="java.lang.Object"/>
                                <Column editable="true" title="Description" type="java.lang.Object"/>
                                <Column editable="true" title="Seats" type="java.lang.Object"/>
                              </Table>
                            </Property>
                            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
                              <TableColumnModel selectionModel="0">
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                              </TableColumnModel>
                            </Property>
                            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
                              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
                            </Property>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                    <Component class="javax.swing.JButton" name="DisplayCoursesButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Display"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DisplayCoursesButtonActionPerformed"/>
                      </Events>
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel7">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Schedule Courses">
                        <Property name="tabTitle" type="java.lang.String" value="Schedule Courses"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="50" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="103" groupAlignment="0" attributes="0">
                                      <Group type="102" attributes="0">
                                          <Component id="jLabel11" min="-2" max="-2" attributes="0"/>
                                          <EmptySpace type="separate" max="-2" attributes="0"/>
                                          <Component id="SelectStudentComboBox" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                      <Group type="102" attributes="0">
                                          <Component id="jLabel10" min="-2" max="-2" attributes="0"/>
                                          <EmptySpace type="separate" max="-2" attributes="0"/>
                                          <Component id="SelectCourseComboBox" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                      <Component id="ScheduleCoursesSubmitButton" alignment="1" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Component id="DisplayScheduleStatus" min="-2" pref="300" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace pref="389" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="30" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel10" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectCourseComboBox" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="-2" pref="22" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel11" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectStudentComboBox" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Component id="ScheduleCoursesSubmitButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="-2" pref="55" max="-2" attributes="0"/>
                              <Component id="DisplayScheduleStatus" min="-2" pref="79" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel10">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Course: "/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel11">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Student:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JButton" name="ScheduleCoursesSubmitButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Submit"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="ScheduleCoursesSubmitButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectCourseComboBox">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="SelectCourseComboBoxActionPerformed"/>
                      </Events>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectStudentComboBox">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JLabel" name="DisplayScheduleStatus">
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel8">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Display Schedule">
                        <Property name="tabTitle" type="java.lang.String" value="Display Schedule"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jScrollPane2" alignment="1" pref="739" max="32767" attributes="0"/>
                          <Group type="102" attributes="0">
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="jLabel12" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="26" max="-2" attributes="0"/>
                                      <Component id="SelectStudentComboBox2" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace min="-2" pref="301" max="-2" attributes="0"/>
                                      <Component id="DisplayScheduleButton" min="-2" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="25" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel12" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectStudentComboBox2" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="unrelated" max="-2" attributes="0"/>
                              <Component id="jScrollPane2" min="-2" pref="251" max="-2" attributes="0"/>
                              <EmptySpace max="-2" attributes="0"/>
                              <Component id="DisplayScheduleButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel12">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Select Student:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectStudentComboBox2">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane2">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTable" name="DisplayScheduleTable">
                          <Properties>
                            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                              <Table columnCount="2" rowCount="4">
                                <Column editable="true" title="Coruse Code" type="java.lang.Object"/>
                                <Column editable="true" title="Status" type="java.lang.Object"/>
                              </Table>
                            </Property>
                            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
                              <TableColumnModel selectionModel="0">
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                                  <Title/>
                                  <Editor/>
                                  <Renderer/>
                                </Column>
                              </TableColumnModel>
                            </Property>
                            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
                              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
                            </Property>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                    <Component class="javax.swing.JButton" name="DisplayScheduleButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Display"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DisplayScheduleButtonActionPerformed"/>
                      </Events>
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JPanel" name="jPanel9">
                  <Properties>
                    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                      <Color blue="cc" green="cc" red="cc" type="rgb"/>
                    </Property>
                  </Properties>
                  <Constraints>
                    <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout" value="org.netbeans.modules.form.compat2.layouts.support.JTabbedPaneSupportLayout$JTabbedPaneConstraintsDescription">
                      <JTabbedPaneConstraints tabName="Drop Course">
                        <Property name="tabTitle" type="java.lang.String" value="Drop Course"/>
                      </JTabbedPaneConstraints>
                    </Constraint>
                  </Constraints>

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <EmptySpace min="-2" pref="56" max="-2" attributes="0"/>
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="jLabel14" min="-2" max="-2" attributes="0"/>
                                          <Component id="jLabel13" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="SelectCourseComboBox2" min="-2" max="-2" attributes="0"/>
                                          <Component id="SelectStudentComboBox3" min="-2" max="-2" attributes="0"/>
                                          <Component id="DropCourseSubmitButton" alignment="1" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                  </Group>
                                  <Group type="102" alignment="0" attributes="0">
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="jScrollPane5" min="-2" pref="587" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <EmptySpace pref="146" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="29" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel14" alignment="3" min="-2" max="-2" attributes="0"/>
                                  <Component id="SelectCourseComboBox2" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="unrelated" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="jLabel13" alignment="3" min="-2" pref="16" max="-2" attributes="0"/>
                                  <Component id="SelectStudentComboBox3" alignment="3" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace type="separate" max="-2" attributes="0"/>
                              <Component id="DropCourseSubmitButton" min="-2" max="-2" attributes="0"/>
                              <EmptySpace type="unrelated" max="-2" attributes="0"/>
                              <Component id="jScrollPane5" min="-2" pref="213" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="jLabel13">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Lucida Grande" size="14" style="0"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Select Student:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="jLabel14">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Lucida Grande" size="14" style="0"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Select Course:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectCourseComboBox2">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="SelectStudentComboBox3">
                      <Properties>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="4">
                            <StringItem index="0" value="Item 1"/>
                            <StringItem index="1" value="Item 2"/>
                            <StringItem index="2" value="Item 3"/>
                            <StringItem index="3" value="Item 4"/>
                          </StringArray>
                        </Property>
                      </Properties>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JButton" name="DropCourseSubmitButton">
                      <Properties>
                        <Property name="text" type="java.lang.String" value="Submit"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="DropCourseSubmitButtonActionPerformed"/>
                      </Events>
                    </Component>
                    <Container class="javax.swing.JScrollPane" name="jScrollPane5">
                      <AuxValues>
                        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                      </AuxValues>

                      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                      <SubComponents>
                        <Component class="javax.swing.JTextArea" name="DropCourseJTextArea">
                          <Properties>
                            <Property name="columns" type="int" value="20"/>
                            <Property name="rows" type="int" value="5"/>
                          </Properties>
                        </Component>
                      </SubComponents>
                    </Container>
                  </SubComponents>
                </Container>
              </SubComponents>
            </Container>
          </SubComponents>
        </Container>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Comic Sans MS" size="16" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Current Semester: "/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="currentSemesterLabel">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Comic Sans MS" size="16" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="           "/>
      </Properties>
    </Component>
    <Component class="javax.swing.JComboBox" name="currentSemesterComboBox">
      <Properties>
        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
          <StringArray count="4">
            <StringItem index="0" value="Item 1"/>
            <StringItem index="1" value="Item 2"/>
            <StringItem index="2" value="Item 3"/>
            <StringItem index="3" value="Item 4"/>
          </StringArray>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="currentSemesterComboBoxActionPerformed"/>
      </Events>
      <AuxValues>
        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
      </AuxValues>
    </Component>
    <Component class="javax.swing.JButton" name="changeSemesterButton">
      <Properties>
        <Property name="text" type="java.lang.String" value="Change Semester"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="changeSemesterButtonActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
