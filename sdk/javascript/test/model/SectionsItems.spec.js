/**
 * eventmobi
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: api-v2
 * Contact: support@cloud-elements.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.Eventmobi);
  }
}(this, function(expect, Eventmobi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Eventmobi.SectionsItems();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('SectionsItems', function() {
    it('should create an instance of SectionsItems', function() {
      // uncomment below and update the code to test SectionsItems
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be.a(Eventmobi.SectionsItems);
    });

    it('should have the property website (base name: "website")', function() {
      // uncomment below and update the code to test the property website
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property image50 (base name: "image50")', function() {
      // uncomment below and update the code to test the property image50
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property facebook (base name: "facebook")', function() {
      // uncomment below and update the code to test the property facebook
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property about (base name: "about")', function() {
      // uncomment below and update the code to test the property about
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property externalId (base name: "external_id")', function() {
      // uncomment below and update the code to test the property externalId
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property linkedin (base name: "linkedin")', function() {
      // uncomment below and update the code to test the property linkedin
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property twitter (base name: "twitter")', function() {
      // uncomment below and update the code to test the property twitter
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property image100 (base name: "image100")', function() {
      // uncomment below and update the code to test the property image100
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property customFieldsValues (base name: "custom_fields_values")', function() {
      // uncomment below and update the code to test the property customFieldsValues
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property companyName (base name: "company_name")', function() {
      // uncomment below and update the code to test the property companyName
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property firstName (base name: "first_name")', function() {
      // uncomment below and update the code to test the property firstName
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property threetopics (base name: "threetopics")', function() {
      // uncomment below and update the code to test the property threetopics
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new Eventmobi.SectionsItems();
      //expect(instance).to.be();
    });

  });

}));
