EventMobi API V1 Spec
=====================
Eventmobi Public API documentation

**Version** 0.6.1
### /events/{event_id}
---
##### ***GET***
**Summary:** get specific event info with sections

**Description:** This is getting the general event info with all section settings. The Speaker, Attendee, Sessions and other data are all stored in differen sections, as the "type" in section data indicated.

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The specific event info |
| 404 | Not Found Event |

##### ***POST***
**Summary:** update event info

**Description:** This is updated basic event info only. To change sessions or items, please use the sections/{section_id} or items/{item_id} to access.

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| event_request | body | undefined | No | undefined |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The event updated |
| 400 | Bad Request |
| 404 | Not Found |

### /events/{event_id}/sections/{section_id}
---
##### ***GET***
**Summary:** get specific section info with items

**Description:** This is getting the general section info with all items data and custom fields if they're available. The Speaker, Attendee, Sessions and other data are all stored in differen sections, as the "type" in section data indicated.

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The specific section info |
| 404 | Not Found Section |

##### ***POST***
**Summary:** update section info

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| section_request | body | undefined | No | undefined |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The section updated |
| 400 | Bad Request |
| 404 | Not Found |

### /events/{event_id}/sections/{section_id}/items
---
##### ***POST***
**Summary:** add a new item in section

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| new_item | body | undefined | No | undefined |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The item added |
| 400 | Bad Request |

### /events/{event_id}/sections/{section_id}/items/{item_id}
---
##### ***GET***
**Summary:** get specific item info

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| item_id | path | the item ID of specific event. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The specific item info |
| 404 | Not Found Section |

##### ***POST***
**Summary:** update item info

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| item_id | path | the item ID of specific event. | Yes | string |
| item_request | body | undefined | No | undefined |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The section updated |
| 400 | Bad Request |
| 404 | Not Found |

##### ***DELETE***
**Summary:** deleta specific item

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| item_id | path | the item ID of specific event. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The item deleted |
| 400 | Bad Request |
| 404 | Not Found |

### /events/{event_id}/sections/{section_id}/xitems/{external_item_id}
---
##### ***GET***
**Summary:** get specific item with external id

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| external_item_id | path | the external item ID of specific event for integration. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The specific item info |
| 404 | Not Found Section |

##### ***POST***
**Summary:** update item info with external id

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| external_item_id | path | the external item ID of specific event for integration. | Yes | string |
| item_request | body | undefined | No | undefined |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The section updated |
| 400 | Bad Request |
| 404 | Not Found |

##### ***DELETE***
**Summary:** deleta specific item with external id

**Parameters**

| Name | Located in | Description | Required | Type |
| ---- | ---------- | ----------- | -------- | ---- |
| event_id | path | the event ID of specific event. | Yes | string |
| section_id | path | the section ID of specific event. | Yes | string |
| external_item_id | path | the external item ID of specific event for integration. | Yes | string |

**Responses**

| Code | Description |
| ---- | ----------- |
| 200 | The item deleted |
| 400 | Bad Request |
| 404 | Not Found |
