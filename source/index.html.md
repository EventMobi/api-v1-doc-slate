---
title: EventMobi API V1 Spec 0.6.1

search: true
---

# EventMobi API V1 Spec 0.6.1
> ### Consumes  
> `application/xml`  

> ### Produces
> `application/xml`
> `application/json`

### Authorization: APIKeySecurity
Type | Name | In | Description
--- | --- | --- | ---
apiKey | X-API-KEY | header | Please ask for your API Key from support team



## GET /events/{event_id}
### Get specific event info with sections 

```http
GET /en/api/v1/events/{event_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "id": "string",
        "event_name": "string",
        "event_description": "string",
        "location_name": "string",
        "location_address": "string",
        "event_website": "string",
        "start_date": "string",
        "end_date": "string",
        "Logo50": "string",
        "Logo100": "string",
        "event_name_full": "string",
        "support_email_address": "string",
        "cache_revision": "integer",
        "partner_id": "string",
        "icon_color": "string",
        "event_app_name": "string",
        "language": "string",
        "header_images": "string",
        "push_update": "string",
        "pushed_revision": "string",
        "secure_mode": "string",
        "login_type": "string",
        "timezone_name": "string",
        "timezone_offset_secs": "integer",
        "time_format": "string",
        "banner_ad_display": [
            "string"
        ],
        "force_login_feedback": "string",
        "restrict_account_reg": "string",
        "restrict_profile_edit": "string",
        "passcode": "string",
        "url": "string",
        "sections": [
            {
                "id": "integer",
                "event_id": "integer",
                "name": "string",
                "type": "string",
                "icon_class": "string",
                "color_class": "string",
                "page": "string",
                "partner_name": "string",
                "partner_token": "string",
                "self_edit_from": "string",
                "self_edit_invite": "string",
                "self_edit_subject": "string",
                "status": "integer",
                "position": "integer",
                "show_ads": "boolean",
                "url": "string"
            }
        ],
        "ads": [
            {
                "id": "string",
                "exhibitor_id": "string",
                "logo_name": "string",
                "title": "string",
                "message": "string",
                "background_color": "string",
                "sponsorshiplevel": "string",
                "type": "string",
                "link": "string",
                "rich": "string",
                "call_to_action": "string",
                "call_to_action_url": "string",
                "call_to_action_text": "string",
                "filename": "string",
                "exhibitor_name": "string"
            }
        ]
    }
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

This is getting the general event info with all section settings. The Speaker, Attendee, Sessions and other data are all stored in differen sections, as the &quot;type&quot; in section data indicated.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The specific event info
404 | object | Not Found Event

## POST /events/{event_id}
### Update event info 

```http
POST /en/api/v1/events/{event_id} HTTP/1.1
Content-Type: application/xml

{
    "event_request": {
        "event_name_full": "string",
        "event_website": "string",
        "event_start": "string",
        "event_end": "string",
        "event_location_name": "string",
        "event_location_address": "string",
        "event_about": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

This is updated basic event info only. To change sessions or items, please use the sections/{section_id} or items/{item_id} to access. Please refer to the EventChangeRequest model definition.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
event_request<b title="required">&nbsp;*&nbsp;</b> | body | object | 

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The event updated
400 | object | Bad Request
404 | object | Not Found


## GET /events/{event_id}/sections/{section_id}
### Get specific section info with items 

```http
GET /en/api/v1/events/{event_id}/sections/{section_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "id": "integer",
        "event_id": "integer",
        "name": "string",
        "type": "string",
        "icon_class": "string",
        "color_class": "string",
        "page": "string",
        "partner_name": "string",
        "partner_token": "string",
        "self_edit_from": "string",
        "self_edit_invite": "string",
        "self_edit_subject": "string",
        "status": "integer",
        "position": "integer",
        "show_ads": "boolean",
        "url": "string",
        "items": [
            {
                "id": "string",
                "first_name": "string",
                "about": "string",
                "image50": "string",
                "image100": "string",
                "title": "string",
                "company_name": "string",
                "threetopics": "null",
                "website": "string",
                "facebook": "string",
                "twitter": "string",
                "linkedin": "string",
                "external_id": "string",
                "custom_fields_values": [
                    {
                        "type_id": "string",
                        "name": "string",
                        "visibility": "string",
                        "edit_permissions": "string",
                        "section_id": "string",
                        "id": "string",
                        "event_id": "string",
                        "field_id": "string",
                        "value": "string",
                        "owner_type": "string",
                        "owner_id": "string",
                        "deleted": "string",
                        "metadata_id": "string"
                    }
                ]
            }
        ],
        "config": "object",
        "custom_fields_names": [
            {
                "id": "string",
                "event_id": "string",
                "type_id": "string",
                "validation_id": "string",
                "name": "string",
                "deleted": "string",
                "section_id": "string",
                "position": "string",
                "metadata_id": "string",
                "visibility": "string",
                "edit_permissions": "string",
                "type_name": "string"
            }
        ]
    }
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

This is getting the general section info with all items data and custom fields if they&#039;re available. The Speaker, Attendee, Sessions and other data are all stored in differen sections, as the &quot;type&quot; in section data indicated.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The specific section info
404 | object | Not Found Section

## POST /events/{event_id}/sections/{section_id}
### Update section info 

```http
POST /en/api/v1/events/{event_id}/sections/{section_id} HTTP/1.1
Content-Type: application/xml

{
    "section_request": {
        "name": "string",
        "position": "string",
        "type": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

This will update section settings. Please refer to the SectionChangeRequest model definition.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
section_request<b title="required">&nbsp;*&nbsp;</b> | body | object | 

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The section updated
400 | object | Bad Request
404 | object | Not Found


## POST /events/{event_id}/sections/{section_id}/items
### Add a new item in section 

```http
POST /en/api/v1/events/{event_id}/sections/{section_id}/items HTTP/1.1
Content-Type: application/xml

{
    "new_item": {
        "topic": "string",
        "description": "string",
        "date": "string",
        "start_time": "string",
        "end_time": "string",
        "location": "string",
        "speakers": "string",
        "tracks": "string",
        "attendees": "string",
        "attendee_name": "string",
        "attendee_email": "string",
        "attendee_about": "string",
        "attendee_topics": "string",
        "attendee_title": "string",
        "attendee_company": "string",
        "website_address": "string",
        "facebook": "string",
        "twitter_login": "string",
        "linkedin_login": "string",
        "phone": "string",
        "filename": "string",
        "custom_fields[custom_field_id]": "string",
        "external_id": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

Add a new item in specific section. Must be the same type, e.g. Attendee, Session, etc. Please refer to the SectionChangeRequest model definition.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
new_item<b title="required">&nbsp;*&nbsp;</b> | body | object | 

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The item added
400 | object | Bad Request


## GET /events/{event_id}/sections/{section_id}/items/{item_id}
### Get specific item info 

```http
GET /en/api/v1/events/{event_id}/sections/{section_id}/items/{item_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "id": "integer",
        "event_id": "integer",
        "name": "string",
        "type": "string",
        "icon_class": "string",
        "color_class": "string",
        "page": "string",
        "partner_name": "string",
        "partner_token": "string",
        "self_edit_from": "string",
        "self_edit_invite": "string",
        "self_edit_subject": "string",
        "status": "integer",
        "position": "integer",
        "show_ads": "boolean",
        "url": "string",
        "items": [
            {
                "id": "string",
                "first_name": "string",
                "about": "string",
                "image50": "string",
                "image100": "string",
                "title": "string",
                "company_name": "string",
                "threetopics": "null",
                "website": "string",
                "facebook": "string",
                "twitter": "string",
                "linkedin": "string",
                "external_id": "string",
                "custom_fields_values": [
                    {
                        "type_id": "string",
                        "name": "string",
                        "visibility": "string",
                        "edit_permissions": "string",
                        "section_id": "string",
                        "id": "string",
                        "event_id": "string",
                        "field_id": "string",
                        "value": "string",
                        "owner_type": "string",
                        "owner_id": "string",
                        "deleted": "string",
                        "metadata_id": "string"
                    }
                ]
            }
        ],
        "config": "object",
        "custom_fields_names": [
            {
                "id": "string",
                "event_id": "string",
                "type_id": "string",
                "validation_id": "string",
                "name": "string",
                "deleted": "string",
                "section_id": "string",
                "position": "string",
                "metadata_id": "string",
                "visibility": "string",
                "edit_permissions": "string",
                "type_name": "string"
            }
        ]
    }
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the item ID of specific event.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The specific item info
404 | object | Not Found Section

## POST /events/{event_id}/sections/{section_id}/items/{item_id}
### Update item info 

```http
POST /en/api/v1/events/{event_id}/sections/{section_id}/items/{item_id} HTTP/1.1
Content-Type: application/xml

{
    "item_request": {
        "topic": "string",
        "description": "string",
        "date": "string",
        "start_time": "string",
        "end_time": "string",
        "location": "string",
        "speakers": "string",
        "tracks": "string",
        "attendees": "string",
        "attendee_name": "string",
        "attendee_email": "string",
        "attendee_about": "string",
        "attendee_topics": "string",
        "attendee_title": "string",
        "attendee_company": "string",
        "website_address": "string",
        "facebook": "string",
        "twitter_login": "string",
        "linkedin_login": "string",
        "phone": "string",
        "filename": "string",
        "custom_fields[custom_field_id]": "string",
        "external_id": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

Update item data in specific section. Must be the same type, e.g. Attendee, Session, etc. Please refer to the SectionChangeRequest model definition.


### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the item ID of specific event.
item_request<b title="required">&nbsp;*&nbsp;</b> | body | object | 

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The section updated
400 | object | Bad Request
404 | object | Not Found

## DELETE /events/{event_id}/sections/{section_id}/items/{item_id}
### Deleta specific item 

```http
DELETE /en/api/v1/events/{event_id}/sections/{section_id}/items/{item_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the item ID of specific event.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The item deleted
400 | object | Bad Request
404 | object | Not Found


## GET /events/{event_id}/sections/{section_id}/xitems/{external_item_id}
### Get specific item with external id 

```http
GET /en/api/v1/events/{event_id}/sections/{section_id}/xitems/{external_item_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "id": "integer",
        "event_id": "integer",
        "name": "string",
        "type": "string",
        "icon_class": "string",
        "color_class": "string",
        "page": "string",
        "partner_name": "string",
        "partner_token": "string",
        "self_edit_from": "string",
        "self_edit_invite": "string",
        "self_edit_subject": "string",
        "status": "integer",
        "position": "integer",
        "show_ads": "boolean",
        "url": "string",
        "items": [
            {
                "id": "string",
                "first_name": "string",
                "about": "string",
                "image50": "string",
                "image100": "string",
                "title": "string",
                "company_name": "string",
                "threetopics": "null",
                "website": "string",
                "facebook": "string",
                "twitter": "string",
                "linkedin": "string",
                "external_id": "string",
                "custom_fields_values": [
                    {
                        "type_id": "string",
                        "name": "string",
                        "visibility": "string",
                        "edit_permissions": "string",
                        "section_id": "string",
                        "id": "string",
                        "event_id": "string",
                        "field_id": "string",
                        "value": "string",
                        "owner_type": "string",
                        "owner_id": "string",
                        "deleted": "string",
                        "metadata_id": "string"
                    }
                ]
            }
        ],
        "config": "object",
        "custom_fields_names": [
            {
                "id": "string",
                "event_id": "string",
                "type_id": "string",
                "validation_id": "string",
                "name": "string",
                "deleted": "string",
                "section_id": "string",
                "position": "string",
                "metadata_id": "string",
                "visibility": "string",
                "edit_permissions": "string",
                "type_name": "string"
            }
        ]
    }
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
external_item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the external item ID of specific event for integration.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The specific item info
404 | object | Not Found Section

## POST /events/{event_id}/sections/{section_id}/xitems/{external_item_id}
### Update item info with external id 

```http
POST /en/api/v1/events/{event_id}/sections/{section_id}/xitems/{external_item_id} HTTP/1.1
Content-Type: application/xml

{
    "item_request": {
        "topic": "string",
        "description": "string",
        "date": "string",
        "start_time": "string",
        "end_time": "string",
        "location": "string",
        "speakers": "string",
        "tracks": "string",
        "attendees": "string",
        "attendee_name": "string",
        "attendee_email": "string",
        "attendee_about": "string",
        "attendee_topics": "string",
        "attendee_title": "string",
        "attendee_company": "string",
        "website_address": "string",
        "facebook": "string",
        "twitter_login": "string",
        "linkedin_login": "string",
        "phone": "string",
        "filename": "string",
        "custom_fields[custom_field_id]": "string",
        "external_id": "string"
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
external_item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the external item ID of specific event for integration.
item_request<b title="required">&nbsp;*&nbsp;</b> | body | object | 

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The section updated
400 | object | Bad Request
404 | object | Not Found

## DELETE /events/{event_id}/sections/{section_id}/xitems/{external_item_id}
### Deleta specific item with external id 

```http
DELETE /en/api/v1/events/{event_id}/sections/{section_id}/xitems/{external_item_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/xml

{
    "status": "string",
    "timestamp": "integer",
    "response": {
        "event": "string"
    }
}
```
```http
HTTP/1.1 400 Bad Request
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
```http
HTTP/1.1 404 Not Found
Content-Type: application/xml

{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the short code of specific event.
section_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the section ID of specific event.
external_item_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the external item ID of specific event for integration.

### Responses
Http code | Type | Description
--- | --- | ---
200 | response | The item deleted
400 | object | Bad Request
404 | object | Not Found



# Models
## Event
```json
{
    "id": "string",
    "event_name": "string",
    "event_description": "string",
    "location_name": "string",
    "location_address": "string",
    "event_website": "string",
    "start_date": "string",
    "end_date": "string",
    "Logo50": "string",
    "Logo100": "string",
    "event_name_full": "string",
    "support_email_address": "string",
    "cache_revision": "integer",
    "partner_id": "string",
    "icon_color": "string",
    "event_app_name": "string",
    "language": "string",
    "header_images": "string",
    "push_update": "string",
    "pushed_revision": "string",
    "secure_mode": "string",
    "login_type": "string",
    "timezone_name": "string",
    "timezone_offset_secs": "integer",
    "time_format": "string",
    "banner_ad_display": [
        "string"
    ],
    "force_login_feedback": "string",
    "restrict_account_reg": "string",
    "restrict_profile_edit": "string",
    "passcode": "string",
    "url": "string",
    "sections": [
        {
            "id": "integer",
            "event_id": "integer",
            "name": "string",
            "type": "string",
            "icon_class": "string",
            "color_class": "string",
            "page": "string",
            "partner_name": "string",
            "partner_token": "string",
            "self_edit_from": "string",
            "self_edit_invite": "string",
            "self_edit_subject": "string",
            "status": "integer",
            "position": "integer",
            "show_ads": "boolean",
            "url": "string"
        }
    ],
    "ads": [
        {
            "id": "string",
            "exhibitor_id": "string",
            "logo_name": "string",
            "title": "string",
            "message": "string",
            "background_color": "string",
            "sponsorshiplevel": "string",
            "type": "string",
            "link": "string",
            "rich": "string",
            "call_to_action": "string",
            "call_to_action_url": "string",
            "call_to_action_text": "string",
            "filename": "string",
            "exhibitor_name": "string"
        }
    ]
}
```

The specific event data

	
### Fields
Name | Type | Description
--- | --- | ---
id | string | 
event_name | string | 
event_description | string | 
location_name | string | 
location_address | string | 
event_website | string | 
start_date | string | 
end_date | string | 
Logo50 | string | 
Logo100 | string | 
event_name_full | string | 
support_email_address | string | 
cache_revision | integer | 
partner_id | string | 
icon_color | string | 
event_app_name | string | 
language | string | 
header_images | string | 
push_update | string | 
pushed_revision | string | 
secure_mode | string | 
login_type | string | 
timezone_name | string | 
timezone_offset_secs | integer | 
time_format | string | 
banner_ad_display | array[string] | 
force_login_feedback | string | 
restrict_account_reg | string | 
restrict_profile_edit | string | 
passcode | string | 
url | string | 
sections | array[object] | 
ads | array[object] | 

	
## EventSection
```json
{
    "id": "integer",
    "event_id": "integer",
    "name": "string",
    "type": "string",
    "icon_class": "string",
    "color_class": "string",
    "page": "string",
    "partner_name": "string",
    "partner_token": "string",
    "self_edit_from": "string",
    "self_edit_invite": "string",
    "self_edit_subject": "string",
    "status": "integer",
    "position": "integer",
    "show_ads": "boolean",
    "url": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | integer | 
event_id | integer | 
name | string | 
type | string | 
icon_class | string | 
color_class | string | 
page | string | 
partner_name | string | 
partner_token | string | 
self_edit_from | string | 
self_edit_invite | string | 
self_edit_subject | string | 
status | integer | 
position | integer | 
show_ads | boolean | 
url | string | 

	
## Ad
```json
{
    "id": "string",
    "exhibitor_id": "string",
    "logo_name": "string",
    "title": "string",
    "message": "string",
    "background_color": "string",
    "sponsorshiplevel": "string",
    "type": "string",
    "link": "string",
    "rich": "string",
    "call_to_action": "string",
    "call_to_action_url": "string",
    "call_to_action_text": "string",
    "filename": "string",
    "exhibitor_name": "string"
}
```

the advertisements used in event

	
### Fields
Name | Type | Description
--- | --- | ---
id | string | 
exhibitor_id | string | 
logo_name | string | 
title | string | 
message | string | 
background_color | string | 
sponsorshiplevel | string | 
type | string | 
link | string | 
rich | string | 
call_to_action | string | 
call_to_action_url | string | 
call_to_action_text | string | 
filename | string | 
exhibitor_name | string | 

	
## Section
```json
{
    "id": "integer",
    "event_id": "integer",
    "name": "string",
    "type": "string",
    "icon_class": "string",
    "color_class": "string",
    "page": "string",
    "partner_name": "string",
    "partner_token": "string",
    "self_edit_from": "string",
    "self_edit_invite": "string",
    "self_edit_subject": "string",
    "status": "integer",
    "position": "integer",
    "show_ads": "boolean",
    "url": "string",
    "items": [
        {
            "id": "string",
            "first_name": "string",
            "about": "string",
            "image50": "string",
            "image100": "string",
            "title": "string",
            "company_name": "string",
            "threetopics": "null",
            "website": "string",
            "facebook": "string",
            "twitter": "string",
            "linkedin": "string",
            "external_id": "string",
            "custom_fields_values": [
                {
                    "type_id": "string",
                    "name": "string",
                    "visibility": "string",
                    "edit_permissions": "string",
                    "section_id": "string",
                    "id": "string",
                    "event_id": "string",
                    "field_id": "string",
                    "value": "string",
                    "owner_type": "string",
                    "owner_id": "string",
                    "deleted": "string",
                    "metadata_id": "string"
                }
            ]
        }
    ],
    "config": "object",
    "custom_fields_names": [
        {
            "id": "string",
            "event_id": "string",
            "type_id": "string",
            "validation_id": "string",
            "name": "string",
            "deleted": "string",
            "section_id": "string",
            "position": "string",
            "metadata_id": "string",
            "visibility": "string",
            "edit_permissions": "string",
            "type_name": "string"
        }
    ]
}
```

the items are only showing in section GET request, not in event GET request.

	
### Fields
Name | Type | Description
--- | --- | ---
id | integer | 
event_id | integer | 
name | string | 
type | string | 
icon_class | string | 
color_class | string | 
page | string | 
partner_name | string | 
partner_token | string | 
self_edit_from | string | 
self_edit_invite | string | 
self_edit_subject | string | 
status | integer | 
position | integer | 
show_ads | boolean | 
url | string | 
items | array[object] | 
config | object | the config meta object with properties
custom_fields_names | array[object] | 

	
## Item
```json
{
    "id": "string",
    "first_name": "string",
    "about": "string",
    "image50": "string",
    "image100": "string",
    "title": "string",
    "company_name": "string",
    "threetopics": "null",
    "website": "string",
    "facebook": "string",
    "twitter": "string",
    "linkedin": "string",
    "external_id": "string",
    "custom_fields_values": [
        {
            "type_id": "string",
            "name": "string",
            "visibility": "string",
            "edit_permissions": "string",
            "section_id": "string",
            "id": "string",
            "event_id": "string",
            "field_id": "string",
            "value": "string",
            "owner_type": "string",
            "owner_id": "string",
            "deleted": "string",
            "metadata_id": "string"
        }
    ]
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | 
first_name | string | 
about | string | 
image50 | string | 
image100 | string | 
title | string | 
company_name | string | 
threetopics | null | 
website | string | 
facebook | string | 
twitter | string | 
linkedin | string | 
external_id | string | 
custom_fields_values | array[object] | 

	
## CustomFieldName
```json
{
    "id": "string",
    "event_id": "string",
    "type_id": "string",
    "validation_id": "string",
    "name": "string",
    "deleted": "string",
    "section_id": "string",
    "position": "string",
    "metadata_id": "string",
    "visibility": "string",
    "edit_permissions": "string",
    "type_name": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | 
event_id | string | 
type_id | string | 
validation_id | string | 
name | string | 
deleted | string | 
section_id | string | 
position | string | 
metadata_id | string | 
visibility | string | 
edit_permissions | string | 
type_name | string | 

	
## CustomFieldValue
```json
{
    "type_id": "string",
    "name": "string",
    "visibility": "string",
    "edit_permissions": "string",
    "section_id": "string",
    "id": "string",
    "event_id": "string",
    "field_id": "string",
    "value": "string",
    "owner_type": "string",
    "owner_id": "string",
    "deleted": "string",
    "metadata_id": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
type_id | string | 
name | string | 
visibility | string | 
edit_permissions | string | 
section_id | string | 
id | string | 
event_id | string | 
field_id | string | 
value | string | 
owner_type | string | 
owner_id | string | 
deleted | string | 
metadata_id | string | 

	
## EventChangeRequest
```json
{
    "event_name_full": "string",
    "event_website": "string",
    "event_start": "string",
    "event_end": "string",
    "event_location_name": "string",
    "event_location_address": "string",
    "event_about": "string"
}
```

update event info

	
### Fields
Name | Type | Description
--- | --- | ---
event_name_full<b title="required">&nbsp;*&nbsp;</b> | string | Name of event. Must be included but can be updated.
event_website | string | Event website
event_start<b title="required">&nbsp;*&nbsp;</b> | string | Start date (required, yyyy-mm-dd)
event_end<b title="required">&nbsp;*&nbsp;</b> | string | End date (required, yyyy-mm-dd)
event_location_name | string | Event location name
event_location_address | string | Event location address
event_about | string | Description of event

	
## SectionChangeRequest
```json
{
    "name": "string",
    "position": "string",
    "type": "string"
}
```

update session info

	
### Fields
Name | Type | Description
--- | --- | ---
name<b title="required">&nbsp;*&nbsp;</b> | string | name of section (required)
position<b title="required">&nbsp;*&nbsp;</b> | string | position of section in section list (required)
type<b title="required">&nbsp;*&nbsp;</b> | string | type of section (one of agenda, speakers, companies, attendees)(required)

	
## ItemChangeRequest
```json
{
    "topic": "string",
    "description": "string",
    "date": "string",
    "start_time": "string",
    "end_time": "string",
    "location": "string",
    "speakers": "string",
    "tracks": "string",
    "attendees": "string",
    "attendee_name": "string",
    "attendee_email": "string",
    "attendee_about": "string",
    "attendee_topics": "string",
    "attendee_title": "string",
    "attendee_company": "string",
    "website_address": "string",
    "facebook": "string",
    "twitter_login": "string",
    "linkedin_login": "string",
    "phone": "string",
    "filename": "string",
    "custom_fields[custom_field_id]": "string",
    "external_id": "string"
}
```

Please use different properties for different section type. Currently, sessions and attendees are supported.

	
### Fields
Name | Type | Description
--- | --- | ---
topic | string | ***Session***: title of session (required)
description | string | ***Session***: description of session (required)
date | string | ***Session***: date of session (required)
start_time | string | ***Session***: start time of session (required)
end_time | string | ***Session***: end time of session
location | string | ***Session***: locatio of session
speakers | string | ***Session***: comma separated list of speakers by external id’s
tracks | string | ***Session***: comma separated list of tracks by external id’s
attendees | string | ***Session***: comma separated list of attendees by emails
attendee_name | string | ***Attendee***: name of attendee (required)
attendee_email | string | ***Attendee***: email address (required)
attendee_about | string | ***Attendee***: attendee bio
attendee_topics | string | ***Attendee***: 3 topics that interest attendee
attendee_title | string | ***Attendee***: title
attendee_company | string | ***Attendee***: company employed at
website_address | string | ***Attendee***: attendee website
facebook | string | ***Attendee***: Facebook
twitter_login | string | ***Attendee***: Twitter name
linkedin_login | string | ***Attendee***: LinkedIn name
phone | string | ***Attendee***: Phone
filename | string | ***Attendee***: name of previously uploaded image file
custom_fields[custom_field_id] | string | ***Attendee***: value for this custom field. Once you have the Custom Field settings from section request, you can use the id within to assign values, E.g. custom_fields[40211]: &quot;Custom Field Value&quot;. You may have multiple custom fields included.
external_id | string | ***Shared***: your code for representing this item

	
## SuccessEnvolope
```json
{
    "status": "string",
    "timestamp": "integer"
}
```

the general envolope for all responses. The &quot;response&quot; section will be different for each endpoint

	
### Fields
Name | Type | Description
--- | --- | ---
status | string | success or error
timestamp | integer | the timestamp of response

	
## ErrorEnvolope
```json
{
    "status": "string",
    "message": "string",
    "timestamp": "integer"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
status | string | will be &quot;error&quot;
message | string | the error message will be included here
timestamp | integer | the timestamp of error occurred

	
