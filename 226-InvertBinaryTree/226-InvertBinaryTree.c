// Last updated: 1/27/2026, 2:59:28 PM
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* invertTree(struct TreeNode* root) {
    if (root == NULL) {
        return root;
    }
    invertTree(root -> left);
    invertTree(root -> right);
    struct TreeNode* curr = root -> left;
    root -> left = root -> right;
    root -> right = curr;
    return root;
}