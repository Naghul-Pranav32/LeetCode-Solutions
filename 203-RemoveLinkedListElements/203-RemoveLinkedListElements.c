// Last updated: 1/27/2026, 2:59:36 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    while (head != NULL && head->val == val) {
        struct ListNode* deleting = head;
        head = head->next;
        free(deleting);
    }
    struct ListNode* temp = head;
    while (temp != NULL && temp->next != NULL) {
        if (temp->next->val == val) {
            struct ListNode* deleting = temp->next;
            temp->next = temp->next->next;
            free(deleting);
        }
        else {
            temp = temp->next;
        }
    }
    return head;
}