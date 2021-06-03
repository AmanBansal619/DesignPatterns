#include <iostream>
#include <vector>

class Strategy
{
public:
    virtual ~Strategy() {}
    virtual std::string DoAlgorithm(const std::vector<std::string> &data) const = 0;
};

class Context
{
private:
    Strategy *strategy_;
public:
    Context(Strategy *strategy = nullptr) : strategy_(strategy)
    {
    }
    ~Context()
    {
        delete this->strategy_;
    }
    void set_strategy(Strategy *strategy)
    {
        delete this->strategy_;
        this->strategy_ = strategy;
    }
    void DoSomeBusinessLogic() const
    {
        // ...
        std::cout << "Context: Sorting data using the strategy (not sure how it'll do it)\n";
        std::string result = this->strategy_->DoAlgorithm(std::vector<std::string>{"a", "e", "c", "b", "d"});
        std::cout << result << "\n";
        // ...
    }
    void printContextClass()
    {
        std::cout << "Context Called" << std::endl;
    }
};

class ConcreteStrategyA : public Strategy
{
    Context *_contextPtr;
public:
    std::string DoAlgorithm(const std::vector<std::string> &data) const override
    {
        std::string result;
        std::for_each(std::begin(data), std::end(data), [&result](const std::string &letter) {
            result += letter;
        });
        std::sort(std::begin(result), std::end(result));

        return result;
    }

    void setContextPtr(Context *contextPtr)
    {
        this->_contextPtr = contextPtr;
    }

    void callContextFromA()
    {
        _contextPtr->printContextClass();
    }
};
class ConcreteStrategyB : public Strategy
{
    Context *_contextPtr;
public:
    std::string DoAlgorithm(const std::vector<std::string> &data) const override
    {
        std::string result;
        std::for_each(std::begin(data), std::end(data), [&result](const std::string &letter) {
            result += letter;
        });
        std::sort(std::begin(result), std::end(result));
        for (int i = 0; i < result.size() / 2; i++)
        {
            std::swap(result[i], result[result.size() - i - 1]);
        }

        return result;
    }

    void setContextPtr(Context *contextPtr)
    {
        this->_contextPtr = contextPtr;
    }

    void callContextFromB()
    {
        _contextPtr->printContextClass();
    }
};

void ClientCode()
{
    ConcreteStrategyA *obj1 = new ConcreteStrategyA();
    ConcreteStrategyB *obj2 = new ConcreteStrategyB();

    Context *context = new Context(obj1);

    obj1->setContextPtr(context);
    obj2->setContextPtr(context);

    obj1->callContextFromA();
    obj2->callContextFromB();

    std::cout << "Client: Strategy is set to normal sorting.\n";
    context->DoSomeBusinessLogic();
    std::cout << "\n";
    std::cout << "Client: Strategy is set to reverse sorting.\n";
    context->set_strategy(obj2);
    context->DoSomeBusinessLogic();

    delete context;
}

int main()
{
    ClientCode();
    return 0;
}