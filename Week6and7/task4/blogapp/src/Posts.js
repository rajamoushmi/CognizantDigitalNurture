import React from 'react';
import Post from './Post'; // Import the Post class

class Posts extends React.Component {
  constructor(props){
    super(props);
    // 48. Initialize the component with an empty list of Posts in state
    this.state = {
      posts: [],
      error: null, // To handle errors for componentDidCatch
    };
  }

  // 49. Create a new method to load posts using Fetch API
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); // 50. Use the provided URL
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      // Map raw data to Post objects if needed, or just use as is for simplicity
      const loadedPosts = data.map(item => new Post(item.id, item.title, item.body));
      this.setState({ posts: loadedPosts, error: null }); // Assign to component state
    } catch (error) {
      console.error("Failed to fetch posts:", error);
      this.setState({ error: error }); // Store error in state to be caught by componentDidCatch
    }
  };

  // 52. Implement componentDidMount() hook to call loadPosts()
  componentDidMount() {
    this.loadPosts();
  }

  // 56. Define componentDidCatch() method to display errors
  componentDidCatch(error, info) {
    console.error("Error caught by componentDidCatch:", error, info);
    this.setState({ error: error });
    alert(`An error occurred: ${error.message}. Check console for details.`);
  }

  // 54. Implement render() to display posts
  render() {
    const { posts, error } = this.state;

    if (error) {
      return <div>Error loading posts: {error.message}</div>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.length > 0 ? (
          posts.map(post => (
            <div key={post.id}>
              <h2>{post.title}</h2> {/* Display title using heading */}
              <p>{post.body}</p> {/* Display body using paragraphs */}
              <hr />
            </div>
          ))
        ) : (
          <div>Loading posts...</div>
        )}
      </div>
    );
  }
}

export default Posts;