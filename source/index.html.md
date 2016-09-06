---
title: EventMobi API V2 Spec 2.0.1a

search: true
---

# EventMobi API V2 Spec 2.0.1a
> ### Produces
> `application/json`



## Get all events

```http
GET /en/api/v2//events HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "data_counters": {
            "sections": "integer",
            "people": "integer",
            "sessions": "integer",
            "companies": "integer",
            "documents": "integer",
            "maps": "integer"
        },
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        },
        "event_urls": {
            "event_app": "string",
            "reg_app": "string",
            "checkin_app": "string",
            "cms_app": "string"
        },
        "timestamps": {
            "request_timestamp": "string",
            "creation_timestamp": "string",
            "update_timestamp": "string"
        }
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

List all the events associated with the current organization by API Key or authentication credentials. 

Only basic event infomation will be provided in response to idenitfy events. Please use /events/{eventID} to retrieve details of each event.



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
limit | query | number | Optional. Limits the number of returned results
offset | query | number | Optional. Define the offset index of returned results
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | An array of basic event info
default | object | General 400/500 error

## Add new event

```http
POST /en/api/v2//events HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        },
        "event_urls": {
            "event_app": "string",
            "reg_app": "string",
            "checkin_app": "string",
            "cms_app": "string"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 402 Payment Required
Content-Type: application/json

{
    "code": "integer"
}
```
```http
HTTP/1.1 409 Conflict
Content-Type: application/json

{
    "code": "integer"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```


Create a new event in the organization that API Key associated. The required fields below should be inclueded in request body. If success, a 200 response message will include the event object added. 

The Event ID is saved with set of (System + ID Value). An event can have multiple IDs in different Systems. This enables easy integration and API access with/from external systems.  

For this POST request, &quot;id&quot; is optional. If &quot;id&quot; field is provided but no &quot;ext_id_system&quot; is specified, this external ID will be added with System Name of &quot;External&quot;. Or if the &quot;ext_id_system&quot; is provided, this System Name will be used. 

Additional IDs can be added in the external_ids property. Please refer to the data structure below. 

An Eventmobi internal ID (unique integer number) will always be automatically created with system name of &quot;Eventmobi&quot;, and use as default ID system if &quot;ext_id_system&quot; doesn&#039;t exist.

API will reject the creation request if the ID exists for each System Name. 

*Please note*: Depends on your package or subscription, you may not have permission to create event with a 402 response. In that case, you may want to [contact our Sales team](http://eventmobi.com).



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The new event created
402 | object | Please contact our Sales to set up new event
409 | object | An Event with same ID already exist for the target system.
default | object | General 400/500 error


## Get specific event by id

```http
GET /en/api/v2//events/{event_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info created
default | object | General 400/500 error

## Update selective data in specific event by id

```http
PATCH /en/api/v2//events/{event_id} HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        },
        "event_urls": {
            "event_app": "string",
            "reg_app": "string",
            "checkin_app": "string",
            "cms_app": "string"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info created
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## Overwrite record of specific event by id

```http
PUT /en/api/v2//events/{event_id} HTTP/1.1
Content-Type: application/json

{
    "event": {
        "id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "short_code": "string",
        "name": "string",
        "description": "string",
        "language": "string",
        "event_location": {
            "location_name": "string",
            "location_address": "string"
        },
        "event_dates": {
            "start_date": "string",
            "end_date": "string",
            "time_zone_tz": "string",
            "time_zone_offset": "string",
            "time_format": "integer"
        },
        "event_urls": {
            "event_app": "string",
            "reg_app": "string",
            "checkin_app": "string",
            "cms_app": "string"
        }
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
event | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The event info updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error


## Get all sections

```http
GET /en/api/v2//events/{event_id}/sections HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The sections in array
default | object | General 400/500 error


## Get all people sections

```http
GET /en/api/v2//events/{event_id}/sections/people_sections HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The people sections in array
default | object | General 400/500 error


## People data overview

```http
GET /en/api/v2//events/{event_id}/people HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "people_number": "integer",
    "group_number": "integer",
    "groups": [
        {
            "group_id": "string",
            "group_name": "string",
            "member_number": "number",
            "group_color": "string",
            "group_note": "string",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_field_number": "integer",
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an overview of people data statistics in specific events. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The statistics of people data
default | object | General 400/500 error


## Retrieve people data in array

```http
GET /en/api/v2//events/{event_id}/people/person HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "query_string": "string",
    "record_number": "integer",
    "people_list": [
        {
            "person_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "profile": {
                "first_name": "string",
                "last_name": "string",
                "email_address": "string",
                "picture": "string",
                "groups": [
                    "string"
                ],
                "company": "string",
                "title": "string",
                "about": "string",
                "social_contacts": {
                    "twitter_url": "string",
                    "facebook_url": "string",
                    "linkedin_url": "string",
                    "website_url": "string"
                }
            },
            "custom_fields_meta": "object",
            "favorite_data": {
                "sessions": "object",
                "companies": "object",
                "docs": "object",
                "notes": "object"
            },
            "regstration": {
                "order_ticket_name": "string",
                "order_paid": "string",
                "order_transaction_id": "string",
                "reg_email_campaign": "string",
                "reg_utm": "string",
                "form_meta": [
                    {
                        "question": "string",
                        "answer": "string"
                    }
                ]
            },
            "docs": [
                "string"
            ],
            "config_meta": "object",
            "tags": "string",
            "activities": [
                {
                    "product": "string",
                    "action": "string",
                    "timestamp": "string"
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

This request will return an array of people data statistics in specific events. Default paginition is the first 20 records from offset 0. 



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The array of people
default | object | General 400/500 error

## Create new person record

```http
POST /en/api/v2//events/{event_id}/people/person HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

"object"
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record created
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error


## Retrieve specific person record

```http
GET /en/api/v2//events/{event_id}/people/person/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The single person record
default | object | General 400/500 error

## Update specific person record

```http
PATCH /en/api/v2//events/{event_id}/people/person/{person_id} HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## Overwrite specific person record

```http
PUT /en/api/v2//events/{event_id}/people/person/{person_id} HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## Overwrite specific person record

```http
DELETE /en/api/v2//events/{event_id}/people/person/{person_id} HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error


## Retrieve the groups specific person belongs to

```http
GET /en/api/v2//events/{event_id}/people/person/{person_id}/groups HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | array[object] | List of groups the person belongs to
default | object | General 400/500 error

## Update specific person record

```http
PATCH /en/api/v2//events/{event_id}/people/person/{person_id}/groups HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## Overwrite specific person record

```http
PUT /en/api/v2//events/{event_id}/people/person/{person_id}/groups HTTP/1.1
Content-Type: application/json

{
    "person": {
        "person_id": "string",
        "external_ids": [
            {
                "id_system": "string",
                "id": "string"
            }
        ],
        "profile": {
            "first_name": "string",
            "last_name": "string",
            "email_address": "string",
            "picture": "string",
            "groups": [
                "string"
            ],
            "company": "string",
            "title": "string",
            "about": "string",
            "social_contacts": {
                "twitter_url": "string",
                "facebook_url": "string",
                "linkedin_url": "string",
                "website_url": "string"
            }
        },
        "upload_picture": {
            "url": "string",
            "trim": "string",
            "rename": "string"
        },
        "uplaod_docs": [
            {
                "url": "string",
                "rename": "string",
                "assign_groups": [
                    "string"
                ]
            }
        ]
    }
}
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
person | body | object | Optional. 

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error

## Overwrite specific person record

```http
DELETE /en/api/v2//events/{event_id}/people/person/{person_id}/groups HTTP/1.1
```
	
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
```http
HTTP/1.1 [default] 
Content-Type: application/json

{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```

Placeholder



### Parameters
Name | In | Type | Description
--- | --- | --- | ---
event_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the event ID of specific event.
person_id<b title="required">&nbsp;*&nbsp;</b> | path | string | the person ID of specific event.
ext_id_system | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.
timestamp_format | query | string | Optional. the external system of ID used in path. Default value is Eventmobi. Once used, all IDs will use external system. For each ID in path, if the external system ID is not defined, will use default instead.

### Responses
Http code | Type | Description
--- | --- | ---
200 | object | The person record updated
403 | object | One or more fields is read-only or auto-generated. It should not set in request.
default | object | General 400/500 error



# Models
## EventObjectRequest
```json
{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    }
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | the default Eventmobi ID of event.
external_ids | array[object] | the external IDs used for integrations.
short_code | string | the short-code and url path of event
name | string | the event name
description | string | the description of event in HTML code
language | string | the language of event
event_location | object | The location information of event
event_dates | object | The dates info of event
event_urls | object | The URLs of each Eventmobi products. Auto-generated: will ignore in post request

	
## EventObjectResponse
```json
{
    "id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "short_code": "string",
    "name": "string",
    "description": "string",
    "language": "string",
    "data_counters": {
        "sections": "integer",
        "people": "integer",
        "sessions": "integer",
        "companies": "integer",
        "documents": "integer",
        "maps": "integer"
    },
    "event_location": {
        "location_name": "string",
        "location_address": "string"
    },
    "event_dates": {
        "start_date": "string",
        "end_date": "string",
        "time_zone_tz": "string",
        "time_zone_offset": "string",
        "time_format": "integer"
    },
    "event_urls": {
        "event_app": "string",
        "reg_app": "string",
        "checkin_app": "string",
        "cms_app": "string"
    },
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
id | string | the default Eventmobi ID of event.
external_ids | array[object] | the external IDs used for integrations
short_code | string | the short-code and url path of event
name | string | the event name
description | string | the description of event in HTML code
language | string | the language of event
data_counters | object | The numbers of each event data type. Auto-generated: will ignore in post request
event_location | object | The location information of event
event_dates | object | The dates info of event
event_urls | object | The URLs of each Eventmobi products. Auto-generated: will ignore in post request
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## DataCounters
```json
{
    "sections": "integer",
    "people": "integer",
    "sessions": "integer",
    "companies": "integer",
    "documents": "integer",
    "maps": "integer"
}
```

The numbers of each event data type. Auto-generated: will ignore in post request

	
### Fields
Name | Type | Description
--- | --- | ---
sections | integer | the number of front-end UI sections in this event
people | integer | the number of people (speaker, attendee, etc.) in this event. Note: the contacts in reg mailing list are not included.
sessions | integer | the number of session included in this event
companies | integer | the number of companies included in this event
documents | integer | the number of documents uploaded
maps | integer | the number of maps

	
## EventLocation
```json
{
    "location_name": "string",
    "location_address": "string"
}
```

The location information of event

	
### Fields
Name | Type | Description
--- | --- | ---
location_name | string | the name of location (e.g. Eventmobi HQ)
location_address | string | the full address of location (e.g. 175 Bloor St East, Toronto, ON M4W 3R8). Please test with Google Maps to ensure the address can be located correctly.

	
## EventDates
```json
{
    "start_date": "string",
    "end_date": "string",
    "time_zone_tz": "string",
    "time_zone_offset": "string",
    "time_format": "integer"
}
```

The dates info of event

	
### Fields
Name | Type | Description
--- | --- | ---
start_date | string | the start date of event in YYYY-MM-DD
end_date | string | the end date of event in YYYY-MM-DD
time_zone_tz | string | the timezone tz name in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. E.g. America/Toronto
time_zone_offset | string | the timezone offset to UTC. E.g. -05:00
time_format | integer | the number value can be 12 or 24 hours format. Default value: 12

	
## EventURLs
```json
{
    "event_app": "string",
    "reg_app": "string",
    "checkin_app": "string",
    "cms_app": "string"
}
```

The URLs of each Eventmobi products. Auto-generated: will ignore in post request

	
### Fields
Name | Type | Description
--- | --- | ---
event_app | string | the URL to launch event web App
reg_app | string | the URL to launch reg web App
checkin_app | string | the URL to launch check in App
cms_app | string | the URL to launch CMS backend

	
## PeopleOverview
```json
{
    "people_number": "integer",
    "group_number": "integer",
    "groups": [
        {
            "group_id": "string",
            "group_name": "string",
            "member_number": "number",
            "group_color": "string",
            "group_note": "string",
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ],
    "custom_field_number": "integer",
    "custom_fields": [
        {
            "custom_field_id": "string",
            "field_name": "string",
            "view_permission": "string",
            "edit_permission": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

The statistics of people data

	
### Fields
Name | Type | Description
--- | --- | ---
people_number | integer | people number in this event. You may use this number for better query pagination.
group_number | integer | the number of groups defined
groups | array[object] | the groups defined in this event.
custom_field_number | integer | the number of custom fields
custom_fields | array[object] | the custom fields defined in this event
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## PeopleRecordsResponse
```json
{
    "query_string": "string",
    "record_number": "integer",
    "people_list": [
        {
            "person_id": "string",
            "external_ids": [
                {
                    "id_system": "string",
                    "id": "string"
                }
            ],
            "profile": {
                "first_name": "string",
                "last_name": "string",
                "email_address": "string",
                "picture": "string",
                "groups": [
                    "string"
                ],
                "company": "string",
                "title": "string",
                "about": "string",
                "social_contacts": {
                    "twitter_url": "string",
                    "facebook_url": "string",
                    "linkedin_url": "string",
                    "website_url": "string"
                }
            },
            "custom_fields_meta": "object",
            "favorite_data": {
                "sessions": "object",
                "companies": "object",
                "docs": "object",
                "notes": "object"
            },
            "regstration": {
                "order_ticket_name": "string",
                "order_paid": "string",
                "order_transaction_id": "string",
                "reg_email_campaign": "string",
                "reg_utm": "string",
                "form_meta": [
                    {
                        "question": "string",
                        "answer": "string"
                    }
                ]
            },
            "docs": [
                "string"
            ],
            "config_meta": "object",
            "tags": "string",
            "activities": [
                {
                    "product": "string",
                    "action": "string",
                    "timestamp": "string"
                }
            ],
            "timestamps": {
                "request_timestamp": "string",
                "creation_timestamp": "string",
                "update_timestamp": "string"
            }
        }
    ]
}
```

the query of people

	
### Fields
Name | Type | Description
--- | --- | ---
query_string | string | the original query string. Offset and limit parameter will show default value (offset=0&amp;limit=20) if not provided in original request.
record_number | integer | the number of recodes that matches query. If no query filters requested, this will be the total number of people.
people_list | array[object] | the array of people

	
## PersonObjectRequest
```json
{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "upload_picture": {
        "url": "string",
        "trim": "string",
        "rename": "string"
    },
    "uplaod_docs": [
        {
            "url": "string",
            "rename": "string",
            "assign_groups": [
                "string"
            ]
        }
    ]
}
```

the single person record

	
### Fields
Name | Type | Description
--- | --- | ---
person_id | string | the unique ID of person in people
external_ids | array[object] | the external IDs used for integrations
profile | object | the profile data of person. Including standard Eventmobi fields as well as custom fields.
upload_picture | object | Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture filename in base profile.
uplaod_docs | array[object] | 

	
## PersonObjectResponse
```json
{
    "person_id": "string",
    "external_ids": [
        {
            "id_system": "string",
            "id": "string"
        }
    ],
    "profile": {
        "first_name": "string",
        "last_name": "string",
        "email_address": "string",
        "picture": "string",
        "groups": [
            "string"
        ],
        "company": "string",
        "title": "string",
        "about": "string",
        "social_contacts": {
            "twitter_url": "string",
            "facebook_url": "string",
            "linkedin_url": "string",
            "website_url": "string"
        }
    },
    "custom_fields_meta": "object",
    "favorite_data": {
        "sessions": "object",
        "companies": "object",
        "docs": "object",
        "notes": "object"
    },
    "regstration": {
        "order_ticket_name": "string",
        "order_paid": "string",
        "order_transaction_id": "string",
        "reg_email_campaign": "string",
        "reg_utm": "string",
        "form_meta": [
            {
                "question": "string",
                "answer": "string"
            }
        ]
    },
    "docs": [
        "string"
    ],
    "config_meta": "object",
    "tags": "string",
    "activities": [
        {
            "product": "string",
            "action": "string",
            "timestamp": "string"
        }
    ],
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

the single person record

	
### Fields
Name | Type | Description
--- | --- | ---
person_id | string | the unique ID of person in people
external_ids | array[object] | the external IDs used for integrations
profile | object | the profile data of person. Including standard Eventmobi fields as well as custom fields.
custom_fields_meta | object | the {custom_field_key:custom_field_value} format JSON object
favorite_data | object | 
regstration | object | the registriation info. Only avialable when using Eventmobi registration product.
docs | array[string] | the docs linked to the people
config_meta | object | the {config_feature_key:config_value} format JSON object E.g.  {&quot;Enable Messaging&quot;:&quot;true&quot;}.
tags | string | tags for the person. Seperated by &quot;,&quot; between keywords.
activities | array[object] | activity logs of a person record.
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## PersonProfile
```json
{
    "first_name": "string",
    "last_name": "string",
    "email_address": "string",
    "picture": "string",
    "groups": [
        "string"
    ],
    "company": "string",
    "title": "string",
    "about": "string",
    "social_contacts": {
        "twitter_url": "string",
        "facebook_url": "string",
        "linkedin_url": "string",
        "website_url": "string"
    }
}
```

the profile data of person. Including standard Eventmobi fields as well as custom fields.

	
### Fields
Name | Type | Description
--- | --- | ---
first_name | string | 
last_name | string | 
email_address | string | 
picture | string | 
groups | array[string] | 
company | string | 
title | string | 
about | string | 
social_contacts | object | The general contact info record

	
## PersonRegistration
```json
{
    "order_ticket_name": "string",
    "order_paid": "string",
    "order_transaction_id": "string",
    "reg_email_campaign": "string",
    "reg_utm": "string",
    "form_meta": [
        {
            "question": "string",
            "answer": "string"
        }
    ]
}
```

the registriation info. Only avialable when using Eventmobi registration product.

	
### Fields
Name | Type | Description
--- | --- | ---
order_ticket_name | string | Ticket Name
order_paid | string | Amount and Currency Type in format of &quot;$ 1,289 USD&quot;
order_transaction_id | string | Striple transaction id for tracking
reg_email_campaign | string | The email title user used to register
reg_utm | string | The UTM tracking parameters in encoded string
form_meta | array[object] | The info user filled in form in reg app

	
## IDs
```json
{
    "id_system": "string",
    "id": "string"
}
```

The IDs from different systems. Used for integration mapping. A default Eventmobi ID will always be generated and cannot be changed once created. Additional IDs can be added/updated for external systems.

	
### Fields
Name | Type | Description
--- | --- | ---
id_system | string | The external ID can be accessed when query indicateds which system the ID belongs to. The default system Eventmobi is reserved.

id | string | the external ID

	
## DocLink
```json
"string"
```

The document ID

	
### Fields
Name | Type | Description
--- | --- | ---

	
## RequestUploadAssociateDoc
```json
{
    "url": "string",
    "rename": "string",
    "assign_groups": [
        "string"
    ]
}
```

Use this structure if you want Eventmobi to download the document from Internet locations and associate it.

	
### Fields
Name | Type | Description
--- | --- | ---
url | string | file location. Have to have a valid document type ()
rename | string | Must be the same file type as origin. Supports jpeg, jpg and png.
assign_groups | array[string] | the groups this documetion belongs to. the groups must be defined in CMS or this will be ignored.

	
## RequestUploadAssociatePicture
```json
{
    "url": "string",
    "trim": "string",
    "rename": "string"
}
```

Use this structure if you want Eventmobi to download the picture from Internet locations and associate picture. You will need to specify image cropping info if the picture is not square (same height and length). This will overwrite the picture filename in base profile.

	
### Fields
Name | Type | Description
--- | --- | ---
url | string | file location. Have to be a valid image file. Supports jpeg, jpg and png.
trim | string | AxB:CxD means manually crop the image at left-top point AxB and right-bottom point CxD in pixels. This parameter is required if your image is not square (same height and length)
rename | string | Must be the same file type as origin. Supports jpeg, jpg and png.

	
## SocialContactInfo
```json
{
    "twitter_url": "string",
    "facebook_url": "string",
    "linkedin_url": "string",
    "website_url": "string"
}
```

The general contact info record

	
### Fields
Name | Type | Description
--- | --- | ---
twitter_url | string | 
facebook_url | string | 
linkedin_url | string | 
website_url | string | 

	
## ResponseGeneralCustomFields
```json
{
    "custom_field_id": "string",
    "field_name": "string",
    "view_permission": "string",
    "edit_permission": "string"
}
```

The base custom field model

	
### Fields
Name | Type | Description
--- | --- | ---
custom_field_id | string | the unique ID of custom field
field_name | string | the field name
view_permission | string | 
edit_permission | string | 

	
## ResponseGeneralGroups
```json
{
    "group_id": "string",
    "group_name": "string",
    "member_number": "number",
    "group_color": "string",
    "group_note": "string",
    "timestamps": {
        "request_timestamp": "string",
        "creation_timestamp": "string",
        "update_timestamp": "string"
    }
}
```

The base response model of groups

	
### Fields
Name | Type | Description
--- | --- | ---
group_id | string | the unique ID of group
group_name | string | the unique name of group
member_number | number | the auto-generated number of members in this group
group_color | string | the HEX color code in #RRGGBB
group_note | string | the optional note/explaination of this group
timestamps | object | The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
## ResponseGroupArray
```json
[
    {
        "group_id": "string",
        "group_name": "string"
    }
]
```

The array of groups

	
### Fields
Name | Type | Description
--- | --- | ---

	
## AttendeePersonalData
```json
{
    "sessions": "object",
    "companies": "object",
    "docs": "object",
    "notes": "object"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
sessions | object | 
companies | object | 
docs | object | 
notes | object | 

	
## GeneralActivityRecord
```json
{
    "product": "string",
    "action": "string",
    "timestamp": "string"
}
```

A single record of people activity history

	
### Fields
Name | Type | Description
--- | --- | ---
product | string | the product of activity. E.g. App/Reg/etc.
action | string | the action info string
timestamp | string | depends on the query parameter timestamp_format setting, this can return GMT/UTC timestamp integer or ISO string.

	
## Timestamps
```json
{
    "request_timestamp": "string",
    "creation_timestamp": "string",
    "update_timestamp": "string"
}
```

The timestamps for the object in either timestamp integer or ISO Date+Time+TimeZone format (E.g. 2016-09-02T15:26:49-04:00 for the same timezone of this event) . Please use query parameter to idenitfy which one you want. Default value is ISO format.

	
### Fields
Name | Type | Description
--- | --- | ---
request_timestamp | string | The time of this API request
creation_timestamp | string | the time of object creation
update_timestamp | string | the time of last modification

	
## PlaceHolder
```json
"object"
```

This is the placeholder

	
### Fields
Name | Type | Description
--- | --- | ---

	
## Error
```json
{
    "code": "integer",
    "message": "string",
    "fields": "string"
}
```
	
### Fields
Name | Type | Description
--- | --- | ---
code | integer | 
message | string | 
fields | string | 

	
